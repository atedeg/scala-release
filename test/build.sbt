ThisBuild / homepage := Some(url("https://github.com/atedeg/scala-release"))
ThisBuild / organization := "dev.atedeg"
ThisBuild / licenses := List("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / publishTo := sonatypePublishToBundle.value
ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"


lazy val root = project
    .in(file("."))
    .settings(
        name := "scala-release-test",
        version := "0.1.0",
        crossScalaVersions := Seq("2.12.16", "2.13.8", "3.1.3"),
    )
