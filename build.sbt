name := "salat-avro"

version := "0.0.11-4-SNAPSHOT"

organization := "com.banno.salat.avro"

scalaVersion := "2.11.4"

// for  org.scalaz.stream#scalaz-stream_2.11;0.5a needed for specs2 extra but not in central 
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "com.novus" %% "salat" % "1.9.9",
  "org.apache.avro" % "avro" % "1.7.7",
  "org.specs2" %% "specs2-core" % "2.4.15" % "test",
  "org.specs2" %% "specs2-matcher-extra" % "2.4.15" % "test"
)

