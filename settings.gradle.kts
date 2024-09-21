plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "java-modules"
include("app")
include("plugins")
include("core")
