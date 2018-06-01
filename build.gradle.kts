// https://github.com/gradle/kotlin-dsl/tree/master/samples/composite-builds
tasks {
    "run" {
        dependsOn(gradle.includedBuild("cli").task(":run"))
        group       = "Application"
        description = "Runs the :cli project :run task"
    }
}
