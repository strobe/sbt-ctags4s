
organization := "cc.evgeniy"

name := "sbt-ctags4s"

version := "0.1.1"

crossSbtVersions := Vector("0.13.16"/*, "1.0.4"*/)  // unfortunately code still use deprecated api

sbtPlugin := true

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += (scalaVersion { version ⇒
  if (version startsWith "2.10") "org.scalatest" %% "scalatest" % "2.0"
  else "org.scalatest" %% "scalatest" % "3.0.4"
}).value


// sbt compat for porting to sbt 1x
libraryDependencies += Defaults.sbtPluginExtra(
  "com.dwijnand" % "sbt-compat" % "1.0.0",
  (sbtBinaryVersion in pluginCrossBuild).value,
  (scalaBinaryVersion in update).value
)

// sbt scripted testing
ScriptedPlugin.scriptedSettings
scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}

// scala ctags generator
libraryDependencies += "cc.evgeniy" %% "sctags" % "1.0.1"

resolvers += Resolver.bintrayRepo("strobe", "sbt-plugins")


scriptedBufferLog := false

bintrayRepository := "sbt-plugins"

bintrayReleaseOnPublish in ThisBuild := false

licenses += ("Apache-2.0", url("http://apache.org/licenses/LICENSE-2.0"))
