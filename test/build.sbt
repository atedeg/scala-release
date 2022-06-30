ThisBuild / homepage := Some(url("https://github.com/atedeg/scala-release"))
ThisBuild / organization := "dev.atedeg"
ThisBuild / licenses := List("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / versionScheme := Some("semver-spec")

ThisBuild / developers := List(
  Developer(
    "nicolasfara",
    "Nicolas Farabegoli",
    "nicolas.farabegoli@gmail.com",
    url("https://github.com/nicolasfara"),
  ),
)


lazy val root = project
    .in(file("."))
    .settings(
        name := "scala-release-test",
        crossScalaVersions := Seq("2.12.16", "2.13.8", "3.1.3"),
        publishTo := sonatypePublishToBundle.value,
        sonatypeCredentialHost := "s01.oss.sonatype.org",
        sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
    )
