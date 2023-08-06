
plugins {
    id("java-library")
    kotlin("jvm")  version "1.8.0"
    id("maven-publish")
}

java {
    withJavadocJar()
    withSourcesJar()
}

val ver =project.version

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}


publishing {
    publications {
        create<MavenPublication>("gav") {
            groupId = project.group.toString()
            artifactId = project.name
            version = ver.toString()
            from(components["java"])
        }
    }
}


tasks.named("publishToMavenLocal") {
    dependsOn("assemble")
}

dependencies {
    implementation (fileTree("dir" to "libs" ,"include" to "[*.jar]"))
    implementation(kotlin("stdlib-jdk8"))
}