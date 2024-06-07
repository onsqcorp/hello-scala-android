plugins {
    alias(libs.plugins.androidApplication)
    id("org.barfuin.gradle.taskinfo") version "2.2.0"
}

apply(plugin = "com.soundcorset.scala-android")

android {
    namespace = "com.soundcorset.helloscala"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.soundcorset.helloscala"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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