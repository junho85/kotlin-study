import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

plugins {
    kotlin("jvm") version "1.8.22"
    id("org.jlleitschuh.gradle.ktlint") version "11.6.1"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk18on:1.77")

    implementation(kotlin("stdlib-jdk8"))
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
    languageVersion = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
