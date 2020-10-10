import sbt._
import Keys._

object Dependencies {
  // Versions

  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"

  // Projects
  val skeleDependencies: Seq[ModuleID] = Seq(scalaTest % Test)
}
