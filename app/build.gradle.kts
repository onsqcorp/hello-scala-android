plugins {
    alias(libs.plugins.androidApplication)
    id("org.barfuin.gradle.taskinfo") version "2.2.0"
}

apply(plugin = "com.soundcorset.scala-android")

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
    implementation(libs.scala.library)
    implementation(libs.androidx.core.ktx)
}