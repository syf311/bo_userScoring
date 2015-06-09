name := "UserScoring Project"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1"

libraryDependencies += "org.mongodb.mongo-hadoop" % "mongo-hadoop-core" % "1.3.2"

libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.0.2"

retrieveManaged := true

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"