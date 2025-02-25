plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }

    dependencies {

        // Retrofit
        implementation(libs.retrofit)

        // Gson converter
        implementation(libs.converter.gson)

        // OkHttp
        implementation(libs.okhttp)
        implementation(libs.logging.interceptor)

        // Coroutines
        implementation(libs.kotlinx.coroutines.android)
    }
}
