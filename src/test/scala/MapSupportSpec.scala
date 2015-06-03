package com.banno.salat.avro.test

import com.banno.salat.avro._
import global._
import org.apache.avro.Schema

object MapSupportSpec extends SalatAvroSpec {
  import models._

  sequential

  "a grater for a case class with an map field" should {

    "generate an avro schema" in {
       val schema = grater[Desmond].asAvroSchema
      val recordSchema = schema.getTypes().get(0)
      println(recordSchema)
      recordSchema must containField("h", Schema.Type.MAP)
      recordSchema.getField("h").schema.getValueType.getType must_== Schema.Type.INT
    }

    "serialize and deserialize" in {
      val oldDesmond = desmond
      println(serializeToJSON(oldDesmond))
      val newDesmond = serializeAndDeserialize(oldDesmond)
      newDesmond must_== oldDesmond
    }

    "generate an avro schema" in {
      val schema = grater[George].asAvroSchema
      val recordSchema = schema.getTypes().get(0)
      println(recordSchema)
      recordSchema must containField("w", Schema.Type.MAP)
      recordSchema.getField("w").schema.getValueType.getType must_== Schema.Type.RECORD
    }

    "serialize and deserialize" in {
      val oldGeorge = george
      println(serializeToJSON(oldGeorge))
      val newGeorge = serializeAndDeserialize(oldGeorge)
      newGeorge must_== oldGeorge
    }

    "generate an avro schema" in {
      val schema = grater[Henry].asAvroSchema
      val recordSchema = schema.getTypes().get(0)
      println(recordSchema)
      recordSchema must containField("y", Schema.Type.MAP)
      recordSchema.getField("y").schema.getValueType.getType must_== Schema.Type.RECORD

      val subRecordSchema = recordSchema.getField("y").schema.getValueType()
      subRecordSchema must containField("w", Schema.Type.MAP)
      subRecordSchema.getField("w").schema.getValueType.getType must_== Schema.Type.RECORD
    }

    "serialize and deserialize" in {
      val oldHenry = henry
      println(serializeToJSON(oldHenry))
      val newHenry = serializeAndDeserialize(oldHenry)
      newHenry must_== oldHenry
    }

  }
}
