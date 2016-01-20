import sbt._
import Keys._

object Dependencies {
  // Versions

  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "2.2.6"

  // Projects
  val skeleDependencies = Seq(scalaTest % "test")
}
