name := "play2-handlebars"

organization := "jp.co.bizreach"

version := "0.0.1"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.3", "2.11.2")

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.play"  %% "play"            % "2.3.3"    % "provided",
  "com.github.jknack"   % "handlebars"      % "1.3.1",
  "org.scalatest"      %% "scalatest"       % "2.2.1"    % "test",
  "org.mockito"         % "mockito-all"     % "1.9.5"    % "test",
  "com.typesafe.play"  %% "play-test"       % "2.3.3"    % "test"
)

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "content/repositories/snapshots")
  else                             Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

scalacOptions := Seq("-deprecation")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/bizreach/play2-handlebars</url>
    <licenses>
      <license>
        <name>The Apache Software License, Version 2.0</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/bizreach/play2-handlebars</url>
      <connection>scm:git:https://github.com/bizreach/play2-handlebars.git</connection>
    </scm>
    <developers>
      <developer>
        <id>scova0731</id>
        <name>Satoshi Kobayashi</name>
        <email>satoshi.kobayashi_at_bizreach.co.jp</email>
        <timezone>+9</timezone>
      </developer>
    </developers>)