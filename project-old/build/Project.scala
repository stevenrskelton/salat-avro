import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) with ApacheLicense2 {
  val novusRels = "repo.novus rels" at "http://repo.novus.com/releases/"
  val novusSnaps = "repo.novus snaps" at "http://repo.novus.com/snapshots/"

  val scalatoolsRels = "repo.scalatools rels" at "https://oss.sonatype.org/content/groups/scala-tools/"
  val scalatoolsSnaps = "repo.scalatools snaps" at "https://oss.sonatype.org/content/repositories/snapshots/"

  val salat = "com.novus" % "salat-core_2.9.0-1" % "0.0.8-SNAPSHOT"
  val avro = "org.apache.avro" % "avro" % "1.7.1"

  // ScalaSig in 2.9.1 depends on the scala-compiler - OUCH!
  val scalaCompiler = "org.scala-lang" % "scala-compiler" % "2.9.1"

  val specs2 = "org.specs2" %% "specs2" % "1.8.1" % "test"
  def specs2Framework = new TestFramework("org.specs2.runner.SpecsFramework")
  override def testFrameworks = super.testFrameworks ++ Seq(specs2Framework)

  Credentials(Path.userHome / ".ivy2" / ".banno_credentials", log)
  override def managedStyle = ManagedStyle.Maven
  lazy val publishTo = "Banno Repo" at (if (version.toString.endsWith("SNAPSHOT")) "http://nexus.banno.com/nexus/content/repositories/snapshots" else "http://nexus.banno.com/nexus/content/repositories/releases")

  def copyrightLine = "Copyright 2011 T8 Webware"
  override def compileAction = super.compileAction dependsOn formatLicenseHeaders
}
