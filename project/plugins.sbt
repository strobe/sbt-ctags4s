addSbtPlugin("net.virtual-void" % "sbt-cross-building" % "0.8.1")

libraryDependencies += { "org.scala-sbt" % "scripted-plugin" % sbtVersion.value }

addSbtPlugin("com.kalmanb.sbt" % "sbt-ctags" % "0.4.0-SNAPSHOT")