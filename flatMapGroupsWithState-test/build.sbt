name := "flatMapGroupsWithState-test"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % "2.2.0"
)

mainClass := Some("Main")
    