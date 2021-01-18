plugins {
    base
    kotlin("multiplatform") version Versions.kotlin apply false
}


allprojects {

    repositories {
        jcenter()
        mavenCentral()
        google()
    }
}