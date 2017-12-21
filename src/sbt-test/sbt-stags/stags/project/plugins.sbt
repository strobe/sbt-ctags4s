// val pluginVersion = sys.props
  // .get("plugin.version")
  // .getOrElse(sys.error("Sys prop plugin.version must be defined!"))

// addSbtPlugin("de.heikoseeberger" % "sbt-fresh" % pluginVersion)

// libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "4.2.0.201601211800-r"

addSbtPlugin("com.kalmanb.sbt" % "sbt-ctags" % "0.4.0-SNAPSHOT")
