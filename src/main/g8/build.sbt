ThisBuild / scalaVersion     := "2.13.14"
ThisBuild / version          := "1.0"
ThisBuild / organization     := "com.example"

val spinalVersion = "1.11.0"
val spinalCore = "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion
val spinalLib = "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion
val spinalIdslPlugin = compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)

lazy val root = (project in file("."))
  .settings(
    name := "$name$",
    Compile / scalaSource := baseDirectory.value / "src" / "spinal",
    libraryDependencies ++= Seq(spinalCore, spinalLib, spinalIdslPlugin)
  )

fork := true