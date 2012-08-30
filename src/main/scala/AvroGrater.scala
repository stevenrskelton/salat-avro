/*
 * Copyright 2011 T8 Webware
 *   
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.banno.salat.avro

import com.novus.salat._
import org.apache.avro.Schema
import org.apache.avro.io._
import org.apache.avro.file._
import org.apache.avro.specific._
import org.apache.avro.reflect._
import scala.collection.mutable.ListBuffer
import java.io._

trait AvroGrater[X <: AnyRef] {
  implicit val ctx: Context
  def asAvroSchema: Schema
  private[avro] def asSingleAvroSchema(knownSchemas: ListBuffer[Schema]): Schema
  def +(other: AvroGrater[_]): MultiAvroGrater
  def supports[X](x: X)(implicit manifest: Manifest[X]): Boolean

  lazy val asDatumWriter: DatumWriter[X] = new AvroGenericDatumWriter[X](asAvroSchema)
  lazy val asDatumReader: AvroDatumReader[X] = asGenericDatumReader
  lazy val asGenericDatumReader: AvroGenericDatumReader[X] = new AvroGenericDatumReader[X](asAvroSchema)

//------------------------------IN-MEMORY------------------------------------------
//Serialize to an in-memory stream with serialize,
//Serialize from in in-memory stream to an object with asObject

  def serialize(x: X, encoder: Encoder): Encoder = try {
    asDatumWriter.write(x, encoder)
    encoder.flush
    encoder
  } catch {
    case e: Throwable => throw new AvroSerializationException(this, x, e)
  }

  def asObject(decoder: Decoder): X = asDatumReader.read(decoder)


//-------------------------------TO/FROM AVRO DATAFILE----------------------------------------------------------------
//Serialize to an Avro file with serializeToDataFile, needs to be passed a schema, file, datum, and DataFileWriter
//deserialize from file with asObjectFromDataFile

//Writing to File
  lazy val asDataFileWriter: DataFileWriter[X] = new DataFileWriter[X](asDatumWriter)

  def serializeToDataFile(schema: Schema, outfile: File, x: X): DataFileWriter[X] = try {
    asDataFileWriter.create(schema, outfile)  
    asDataFileWriter.append(x)          //while datafilewriter.hasNext() {asDataFileWriter.append(x)}??????
    asDataFileWriter.close
    asDataFileWriter
  } catch {
    case e: Throwable => throw new AvroSerializationException(this, x, e)
  }

//Reading from File  

  def asObjectFromDataFile(infile: File): X = {
    val asDataFileReader: DataFileReader[X] = new DataFileReader[X](infile, asDatumReader)
    asDataFileReader.next()
  }  
}
