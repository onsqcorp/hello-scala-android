
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.scalaAndroid)
    id("org.barfuin.gradle.taskinfo") version "2.2.0"
}
// Possible choices of scala versions are
// 2.11.x
// 2.12.7 or earlier
// 2.13.7 or later
// 3.3.3 or later
scala.scalaVersion = "3.7.0-RC2"

android {
    namespace = "com.soundcorset.helloscala"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.soundcorset.helloscala"
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
}