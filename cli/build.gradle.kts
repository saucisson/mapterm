// https://guides.gradle.org/building-kotlin-jvm-libraries/?_ga=2.113834244.2057732713.1527841914-644729026.1511187536

group   = "saucisson.mapterm"
version = "0.1"

plugins {
  application
  kotlin("jvm") version "1.2.31"
  id("org.jetbrains.dokka") version "0.9.16"
}

repositories {
  jcenter()
}

dependencies {
  implementation(kotlin("stdlib"))
  compile("saucisson.mapterm:lib:$version")
  compile("com.xenomachina:kotlin-argparser:+")
}

application {
  mainClassName = "saucisson.mapterm.cli.MainKt"
}

val dokka by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
  outputFormat = "html"
  outputDirectory = "$buildDir/javadoc"
}
