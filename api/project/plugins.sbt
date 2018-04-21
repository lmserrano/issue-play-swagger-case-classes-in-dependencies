logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")

// Swagger Play
addSbtPlugin("com.iheart" %% "sbt-play-swagger" % "0.7.4")
