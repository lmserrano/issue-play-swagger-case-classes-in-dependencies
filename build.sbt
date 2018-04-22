name := "issue-play-swagger-case-classes-in-dependencies"

version := "0.1"

scalaVersion := "2.12.5"

//.settings(run <<= run in server)


lazy val root = project.in(file("."))
  .enablePlugins(PlayScala, SwaggerPlugin)
  .settings(
    run := {
      (run in api in Compile).evaluated
    },

    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice ),
    // Swagger Play Configuration
    swaggerDomainNameSpaces := Seq("models", "data"),
    //swaggerTarget := new File("api/target/swagger"),
    libraryDependencies += "org.webjars" % "swagger-ui" % "2.2.0"
  )
  .aggregate(common, api)
  .dependsOn(common, api)

lazy val common = project.in(file("common"))

lazy val api = project.in(file("api"))
  .settings(
    resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
    libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice ),
    // Swagger Play Configuration
    swaggerDomainNameSpaces := Seq("models", "data"),
    libraryDependencies += "org.webjars" % "swagger-ui" % "2.2.0"
  )
  .enablePlugins(PlayScala, SwaggerPlugin)
  .dependsOn(common)

