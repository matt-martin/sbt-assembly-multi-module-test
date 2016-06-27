lazy val commonSettings = Seq(
    organization := "com.example",
    scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  aggregate(test, core).
  settings(
    name := "sbt-assembly-multi-module-test",
    version := "1.0"
  )

lazy val test = project.in(file("test")).settings(
    commonSettings: _*
  ).settings(
    version := "1.0",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11"
  )

lazy val core = project.in(file("core")).settings(
    commonSettings: _*
  ).settings(
    version := "1.0"
  ).dependsOn(test % "test->compile;runtime->compile")
