plugins {
    kotlin("multiplatform")
}


repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    jvm()
    js {
        browser()
        nodejs()
    }

    sourceSets {

        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("io.konform:konform:${Versions.konform}")
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation("io.konform:konform-js:${Versions.konform}")
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
                implementation("io.konform:konform-jvm:${Versions.konform}")
            }
        }
    }
}

tasks {
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "11"
            freeCompilerArgs = listOf("-Xinline-classes")
        }
    }
}