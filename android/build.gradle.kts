import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "in.lazymanstudios.uri_to_file"
version = "1.0"

repositories {
        google()
        mavenCentral()
    }


android {
    compileSdk =37
    namespace = "in.lazymanstudios.uri_to_file"
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    defaultConfig {
        minSdk 24
    }
}
