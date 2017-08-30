import sbt.Resolver

lazy val scalacOpts = scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint", // Enable recommended additional warnings.
  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
  "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
  "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
  "-Ywarn-numeric-widen", // Warn when numerics are widened.
  "-Ypartial-unification"
)

lazy val commonSettings = Seq(
  organization := "org.amaizing",
  scalaVersion := "2.12.3",
  libraryDependencies ++= Seq(
    "org.specs2" %% "specs2-core" % "3.9.1" % "test",
    "org.specs2" %% "specs2-scalacheck" % "3.9.1" % "test"
  ),
  resolvers ++= Seq(
    "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases",
    Resolver.jcenterRepo,
    "Sonatype OSS Releases" at "http://oss.sonatype.org/content/repositories/releases/"
  ),
  version :=  "1.3.5-SNAPSHOT",
  packageOptions in assembly ~= { pos =>
    pos.filterNot { po =>
      po.isInstanceOf[Package.MainClass]
    }
  },
  test in assembly := {},
  crossScalaVersions := Seq( "2.11.8", "2.10.6"),
  scalacOpts
)

lazy val root = Project(id = "saddle", base = file("."))
  .settings(commonSettings).aggregate(core, test_framework)


lazy val core = Project(id = "saddle-core", base = file("saddle-core"))
  .settings(commonSettings)
  .settings(libraryDependencies ++= Seq(
    "joda-time" % "joda-time" % "2.1",
    "org.joda" % "joda-convert" % "1.2",
    "org.scala-saddle" % "google-rfc-2445" % "20110304",
    "com.googlecode.efficient-java-matrix-library" % "ejml" % "0.19",
    "org.apache.commons" % "commons-math" % "2.2",
    "it.unimi.dsi" % "fastutil" % "6.5.4",
    "it.unimi.dsi" % "dsiutils" % "2.0.15",
    "com.github.nscala-time" %% "nscala-time" % "2.16.0"),
    assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false),
    assemblyJarName in assembly := "saddle.jar"
  )

lazy val test_framework =
  Project(
    id = "saddle-test-framework",
    base = file("saddle-test-framework"))
    .settings(commonSettings)
    .settings(Seq(
      libraryDependencies ++= Seq(
        "org.specs2" %% "specs2-core" % "3.9.1" % "compile",
        "org.specs2" %% "specs2-scalacheck" % "3.9.1" % "compile"
      )
    )).dependsOn (core)