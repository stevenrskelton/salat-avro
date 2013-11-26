package com.banno.salat.avro.test

import com.banno.salat.avro._
import global._

import java.io.ByteArrayOutputStream
import org.apache.avro.io.{ DatumReader, DatumWriter, DecoderFactory, EncoderFactory }
import org.apache.avro.Schema

import org.specs2.matcher.JsonMatchers

object BasicCaseClassSpec extends SalatAvroSpec with JsonMatchers {
  import models._

  "a grater" should {

    "make a datum writer for a basic case class" >> {
      val json = serializeToJSON(ed)
      println(json)
      json must /("com.banno.salat.avro.test.models.Edward") /("a" -> ed.a)
      json must /("com.banno.salat.avro.test.models.Edward") /("b" -> ed.b)
      json must /("com.banno.salat.avro.test.models.Edward") /("c" -> ed.c)
      json must /("com.banno.salat.avro.test.models.Edward") /("aa") /("string" -> ed.aa.get)
      json must /("com.banno.salat.avro.test.models.Edward") /("bb") /("int" -> ed.bb.get)
      json must /("com.banno.salat.avro.test.models.Edward") /("cc") /("double" -> ed.cc.get)
      json must /("com.banno.salat.avro.test.models.Edward") /("aaa" -> null)
      json must /("com.banno.salat.avro.test.models.Edward") /("bbb" -> null)
      json must /("com.banno.salat.avro.test.models.Edward") /("ccc" -> null)
    }


  }

}
