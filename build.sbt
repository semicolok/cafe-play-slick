name := "cafe-server"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
//  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.1",
  "org.webjars" % "angularjs" % "1.2.12",
//  "org.webjars" % "requirejs" % "2.1.10",
  "org.webjars" % "bootstrap" % "3.1.0",
  "com.typesafe.slick" %% "slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick" % "0.5.0.8",
  "org.virtuslab" %% "unicorn" % "0.4",
  "mysql" % "mysql-connector-java" % "5.1.28"
)     

play.Project.playScalaSettings
