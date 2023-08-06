
plugins {
    id("java-library")
    kotlin("jvm")
    id("org.jetbrains.kotlin.kapt")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "17"
    }
}

addProcesador()

dependencies {
    implementation (fileTree("dir" to "libs" ,"include" to "[*.jar]"))
    compileOnly(project(":MapperDecorador"))
    //compileOnly("com.github.FrancoAlv:AlvMapperDecorador:1.0.0")
    implementation(kotlin("stdlib-jdk8"))
}

fun Project.addProcesador(){
    dependencies {
        add("implementation","com.squareup:kotlinpoet:1.11.0")
        add("implementation","com.google.auto.service:auto-service:1.0-rc4")
        add("kapt", "com.google.auto.service:auto-service:1.0-rc4")
    }
}