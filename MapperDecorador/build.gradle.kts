plugins {
    id("java-library")
    kotlin("jvm")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation (fileTree("dir" to "libs" ,"include" to "[*.jar]"))
    implementation(kotlin("stdlib-jdk8"))
}