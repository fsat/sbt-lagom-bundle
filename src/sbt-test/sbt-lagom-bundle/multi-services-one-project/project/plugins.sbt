addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.0.0-M1")
addSbtPlugin("com.typesafe.sbt" % "sbt-lagom-bundle" % sys.props("project.version"))

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6"
