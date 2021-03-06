
name := """play"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
, "commons-io" % "commons-io" % "2.4"  
, "org.apache.jena" % "jena-arq" % "2.10.1" excludeAll(ExclusionRule(organization = "org.slf4j"))
, "es.weso" % "shexcala_2.11" % "0.1.7" excludeAll(ExclusionRule(organization = "org.slf4j"))  
, "org.webjars" %% "webjars-play" % "2.3.0"
, "org.webjars" % "jquery" % "2.1.1"
, "org.webjars" % "jquery-ui" % "1.11.0"
, "org.webjars" % "jquery-ui-themes" % "1.10.3"
, "org.webjars" % "jquery-ui-touch-punch" % "0.2.3-2"
, "org.webjars" % "codemirror" % "4.3"
, "org.webjars" % "prettify" % "4-Mar-2013"
)

resolvers += "Bintray" at "http://dl.bintray.com/weso/weso-releases"
