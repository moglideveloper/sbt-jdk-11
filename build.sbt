name := "sbt-jdk-11"

scalacOptions ++= Seq(
  "-target:11"
)

javacOptions ++= Seq("-source", "11", "-target", "11")



