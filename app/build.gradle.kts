plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.20"
    application
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    // https://kotlinlang.org/docs/whatsnew1720.html#preview-of-the-operator-for-creating-open-ended-ranges
    // -> How to enable the ..< operator
    kotlinOptions { languageVersion = "1.8" }
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_HIGHER
    targetCompatibility = JavaVersion.VERSION_HIGHER
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClass.set("ranges.AppKt")
}
