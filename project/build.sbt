ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "dbr-scala"
  )

libraryDependencies += "com.databricks" % "databricks-connect" % "14.3.0"
