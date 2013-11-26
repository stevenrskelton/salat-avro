package com.banno.salat.avro.test
import com.banno.salat.avro.MultiAvroGrater

import com.banno.salat.avro._
import global._

import com.novus.salat.CaseClass
import java.io.ByteArrayOutputStream
import java.io.File
import scala.collection.JavaConversions._
import org.specs2.mutable._
import org.specs2.matcher.Matcher
import org.apache.avro.Schema
import org.apache.avro.io.{ DatumReader, DatumWriter, DecoderFactory, EncoderFactory }

trait SalatAvroSpec extends Specification {
  import scala.collection.JavaConversions._

  
  def serializeToJSON[X <: CaseClass : Manifest](x: X, maybeGrater: Option[AvroGrater[X]] = None): String = {
    val g = maybeGrater.getOrElse(grater[X])
    val baos = new ByteArrayOutputStream
    val encoder = EncoderFactory.get.jsonEncoder(g.asAvroSchema, baos)
    g.serialize(x, encoder)
    new String(baos.toByteArray())
  }

}
