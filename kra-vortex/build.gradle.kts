plugins {
    `kra-module`
}

dependencies {
    implementation(common)

    implementation(libs.bundles.common)
    
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.websockets)
    implementation(libs.ktor.client.serialization.json)
    implementation(libs.ktor.client.content.negotiation)
}
