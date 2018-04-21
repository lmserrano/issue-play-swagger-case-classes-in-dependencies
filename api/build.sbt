name := "api"

lazy val api = (project in file(".")).enablePlugins(PlayScala, SwaggerPlugin)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

// Swagger Play Configuration
swaggerDomainNameSpaces := Seq("models", "data")

libraryDependencies += "org.webjars" % "swagger-ui" % "2.2.0"
