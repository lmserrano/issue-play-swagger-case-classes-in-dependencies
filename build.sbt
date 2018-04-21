name := "issue-play-swagger-case-classes-in-dependencies"

version := "0.1"

scalaVersion := "2.12.5"


lazy val root = project.in(file("."))
  .aggregate(common, api)
  .dependsOn(common, api)

lazy val common = project.in(file("common"))

lazy val api = project.in(file("api"))
  .dependsOn(common)

