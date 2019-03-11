import sbt._
import Keys._

object Dependencies {
  // Versions

  // Libraries
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.6"

  // Projects
  val skeleDependencies: Seq[ModuleID] = Seq(scalaTest % Test)
}
