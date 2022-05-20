plugins {
    groovy
    `kotlin-dsl`
}

repositories {
    maven("https://maven.dimensional.fun/releases")
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("gradle-plugin", version = "1.6.21"))
    implementation(kotlin("serialization", version = "1.6.21"))

    implementation("fun.dimensional.gradle:gradle-tools:1.0.3")
    implementation("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.17.1")

    implementation(gradleApi())
    implementation(localGroovy())
}
