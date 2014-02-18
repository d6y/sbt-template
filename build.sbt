name := "MyProject"

scalaVersion := "2.10.3"

scalacOptions ++= Seq(
  "-deprecation", 
  "-encoding", "UTF-8"
)

libraryDependencies ++= Seq(
    "junit"                     %  "junit"             % "4.7"    % "test",
    "org.scalatest"             %% "scalatest"         % "2.0"    % "test"
)

// Settings just for the Eclipse SBT plug-in

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

