import com.banno.license.Plugin.LicenseKeys._
import com.banno.license.Licenses._

licenseSettings

license := apache2("Copyright 2011-2013 T8 Webware")

removeExistingHeaderBlock := true

name := "salat-avro"

version := "0.0.7.6-SNAPSHOT"

organization := "com.banno.salat.avro"

scalaVersion := "2.8.1"

resolvers ++= Seq(
  "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/"
)

credentials += Credentials(Path.userHome / ".ivy2" / ".banno_credentials")

publishMavenStyle := true

publishTo := Some("Banno Repo" at (if (version.toString.endsWith("SNAPSHOT")) "http://nexus.banno.com/nexus/content/repositories/snapshots" else "http://nexus.banno.com/nexus/content/repositories/releases"))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.3" % "test",
  "com.novus" %% "salat-core" % "0.0.7",
  "org.apache.avro" % "avro" % "1.5.4",
  "ch.qos.logback" % "logback-core" % "1.0.0",
  "ch.qos.logback" % "logback-classic" % "1.0.0"
)
