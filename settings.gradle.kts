include(":kra-common")
include(":kra-core")
include(":kra-vortex")
include(":kra-delta")
include(":kra-bonfire")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            kotlinx()
            net()
            common()
        }
    }
}


fun VersionCatalogBuilder.kotlinx() {
    library("kotlinx-datetime", "org.jetbrains.kotlinx", "kotlinx-datetime").version("0.3.2")
}

fun VersionCatalogBuilder.common() {
    version("kotlinx-coroutines", "1.6.1")

    /* misc */
    library("kyuso", "mixtape.oss", "kyuso-jvm").version("1.0")

    /* serialization */
    library("kx-ser-json", "org.jetbrains.kotlinx", "kotlinx-serialization-json").version("1.3.2")

    /* kotlin */
    library("kotlinx-coroutines", "org.jetbrains.kotlinx", "kotlinx-coroutines-core").versionRef("kotlinx-coroutines")
    library("kotlinx-atomicfu", "org.jetbrains.kotlinx", "atomicfu").version("0.17.2")
    library("kotlin-stdlib", "org.jetbrains.kotlin", "kotlin-stdlib").version("1.6.21")
    library("kotlin-reflect", "org.jetbrains.kotlin", "kotlin-reflect").version("1.6.21")
    library("kotlin-logging", "io.github.microutils", "kotlin-logging").version("2.1.21")

    /* bundles */
    bundle("common", listOf("kx-ser-json", "kotlinx-coroutines", "kotlinx-atomicfu", "kotlin-stdlib", "kotlin-logging", "kotlin-reflect"))
}

/* networking */
fun VersionCatalogBuilder.net() {
    /* ktor */
    val ktor = version("ktor", "2.0.0")

    library("ktor-io", "io.ktor", "ktor-io").versionRef(ktor)

    // client
    library("ktor-client-cio", "io.ktor", "ktor-client-cio").versionRef(ktor)
    library("ktor-client-websockets", "io.ktor", "ktor-client-websockets").versionRef(ktor)
    library("ktor-client-serialization-json", "io.ktor", "ktor-serialization-kotlinx-json").versionRef(ktor)
    library("ktor-client-content-negotiation", "io.ktor", "ktor-client-content-negotiation").versionRef(ktor)

    // server
    library("ktor-server-core", "io.ktor", "ktor-server-core").versionRef(ktor)
    library("ktor-server-cio", "io.ktor", "ktor-server-cio").versionRef(ktor)
    library("ktor-server-content-negotiation", "io.ktor", "ktor-server-content-negotiation").versionRef(ktor)
    library("ktor-websockets", "io.ktor", "ktor-websockets").versionRef(ktor)
    library("ktor-serialization", "io.ktor", "ktor-serialization-kotlinx-json").versionRef(ktor)

    // server/client
    library("ktor-network", "io.ktor", "ktor-network").versionRef(ktor)
}

