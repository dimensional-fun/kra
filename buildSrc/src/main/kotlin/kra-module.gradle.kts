import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    `maven-publish`

    kotlin("jvm")
    kotlin("plugin.serialization")
}

kotlin {
    explicitApi()
}

repositories {
    mavenCentral()

    /* maven.dimensional.fun */
    maven(url = "https://maven.dimensional.fun/releases")

    /* other */
    maven(url = "https://dimensional.jfrog.io/artifactory/maven")
    maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    maven(url = "https://jitpack.io")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs = listOf(
                "-opt-in=kotlin.ExperimentalStdlibApi",
                "-opt-in=kotlin.RequiresOptIn",
                "-opt-in=kotlinx.serialization.InternalSerializationApi",
                "-opt-in=kotlinx.serialization.ExperimentalSerializationApi",
                "-opt-in=kotlin.contracts.ExperimentalContracts",
                "-opt-in=kotlin.time.ExperimentalTime",
            )
        }
    }

    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
    }
}

