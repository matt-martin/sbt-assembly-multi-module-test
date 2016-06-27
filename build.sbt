lazy val root = (project in file(".")).
  aggregate(test, core).
  settings(
    name := "sbt-assembly-multi-module-test",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

lazy val test = project.in(file("test")).settings(
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11"
  )

lazy val core = project.in(file("core")).dependsOn(test % "test->compile")
