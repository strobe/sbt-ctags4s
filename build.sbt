organization := "com.kalmanb.sbt"

name := "sbt-ctags"

version := "0.4.0-SNAPSHOT"

crossSbtVersions := Vector("0.13.16", "1.0.4")

sbtPlugin := true

//publishMavenStyle := false

//publishArtifact in Test := false

//publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += (scalaVersion { version ⇒
  if (version startsWith "2.10") "org.scalatest" %% "scalatest" % "2.0"
  else "org.scalatest" %% "scalatest" % "2.0.M6-SNAP3"
}).value

libraryDependencies ++= Seq(
  "co.pjrt" % "stags_2.12" % "0.2.8",
  "co.pjrt" % "stags-cli_2.12" % "0.2.8"
)

ScriptedPlugin.scriptedSettings
scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false
