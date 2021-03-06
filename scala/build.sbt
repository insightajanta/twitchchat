name := "twitchchat"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.2.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "2.2.1" % "provided",
  "org.apache.spark" %% "spark-streaming" % "2.2.1" % "provided",
  "org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.2.1" % "provided"
)
libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.3.2"
libraryDependencies += "joda-time" % "joda-time" % "2.8.1"
//libraryDependencies += "com.typesafe" % "config" % "1.3.2"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}