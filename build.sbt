name := "SparkCas"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.1"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.4.0-M1"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.10.5"

libraryDependencies += "org.apache.cassandra" % "cassandra-thrift" % "2.1.8"

libraryDependencies += "org.apache.cassandra" % "cassandra-clientutil" % "2.1.8"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "2.1.7"
