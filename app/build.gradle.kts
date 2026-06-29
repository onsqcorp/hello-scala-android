
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.scalaAndroid)
}
// Possible choices of scala versions are
// 2.13.7 or later
// 3.3.3 or later
scala.scalaVersion = "3.8.4"

android {
    namespace = "com.soundcorset.helloscala"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.soundcorset.helloscala"
        minSdk = 28
        targetSdk = 37
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

// https://github.com/gradle/gradle/issues/36466
tasks.withType<ScalaCompile>().configureEach {
    scalaCompileOptions.additionalParameters?.add("-Xunchecked-java-output-version:17")
}