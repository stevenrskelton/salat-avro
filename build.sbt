name := "salat-avro"

version := "0.0.7.2-2-SNAPSHOT"

organization := "com.banno"

// scalaVersion := "2.8.1"
scalaVersion := "2.9.1"

resolvers += "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/"

resolvers += "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "repo.novus rels" at "http://repo.novus.com/releases/"

resolvers += "repo.novus snaps" at "http://repo.novus.com/snapshots/"

credentials += Credentials(Path.userHome / ".ivy2" / ".banno_credentials") //No logging argument like in sbt 0.7?

publishMavenStyle := true

publishTo := Some("Banno Repo" at (if (version.toString.endsWith("SNAPSHOT")) "http://nexus.banno.com/nexus/content/repositories/snapshots" else "http://nexus.banno.com/nexus/content/repositories/releases"))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.8.1" % "test",
  "com.novus" % "salat-core_2.9.0-1" % "0.0.8-SNAPSHOT",
  "org.apache.avro" % "avro" % "1.7.1"
 // "com.novus" %% "salat-util" % "1.9.1"
 // "ch.qos.logback" % "logback-core" % "1.0.0",   //for use with scalaVersion 2.8.1
 // "ch.qos.logback" % "logback-classic" % "1.0.0" //for use with scalaVersion 2.8.1
)
