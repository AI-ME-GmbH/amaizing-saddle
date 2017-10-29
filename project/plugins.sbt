resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("com.orrsella" % "sbt-sublime" % "1.0.9")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.12")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.1")
addSbtPlugin("com.47deg" % "sbt-microsites" % "0.7.4")
addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.5.5")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.2")
