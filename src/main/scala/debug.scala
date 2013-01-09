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


import models._
import com.banno.salat.avro._
import global._
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.BufferedInputStream
import org.apache.avro._
import org.apache.avro.io._
import org.apache.avro.file._

object Main extends App {


  val myName = "Julian"
  val myInt = 4
  val myBool = true 

  //val myRecord = MyRecord(myName)
  val myRecord = MyRecord(myName, myInt, myBool)
  //val myRecord = MyRecord(myInt)
    Console.println("original record:" + myRecord)

/*------------------IN-MEMORY DATA SERIALIZATION------------------------
For salat-avro 'case class to avro' serialization we need to provide a record, the record Case Class, and an encoder, and a decoder and record Case Class to deserialize back into the scala object of the case class. */

//Serialize to an in-memory output stream:  
  val baos = new ByteArrayOutputStream
  val binaryEncoder = EncoderFactory.get().binaryEncoder(baos, null)

  val dbo = grater[MyRecord].serialize(myRecord, binaryEncoder)
    
//Deserialize back to object:
  val bytes = baos.toByteArray() 

  val decoder = DecoderFactory.get().binaryDecoder(bytes, null)

  val objFromInMemory = grater[MyRecord].asObject(decoder)
    Console.println("from memory: " + objFromInMemory)
    Console.println("equal to original?: " + (myRecord == objFromInMemory).toString)



/*-------------TO AND FROM AVRO DATAFILE------------------------------------------
In order to write avro files we need to provide a schema  (obtained from a salat method acting on the record Case Class), a file destination path, and a record. To deserialize from file we will need to provide an infile path
*/
  
//Serialize to an Avro DataFile
  val schema: Schema = grater[MyRecord].asAvroSchema
  val outfile = new File("/home/julianpeeters/output.avro")
  val avro = grater[MyRecord].serializeToDataFile(schema, outfile, myRecord)

//Deserialize from File: Read DataFile and deserialize back to object 
  val infile = new File("/home/julianpeeters/input.avro")
  val objFromFile = grater[MyRecord].asObjectFromDataFile(infile)  
    Console.println("from Avro DataFile: " + objFromFile)
    Console.println("equals orginal?: " + (myRecord == objFromFile).toString)

}
