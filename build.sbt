lazy val root = (project in file(".")).
  settings(
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-Xss2m", "-Dfile.encoding=UTF-8"),
  )
