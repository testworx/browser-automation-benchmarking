/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * To learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.6/samples
 */
plugins {
    java
    groovy
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    // Micrometer Metrics libs
    implementation("io.micrometer:micrometer-core:1.12.4")
    implementation("io.micrometer:micrometer-registry-prometheus:1.12.4")

    // Testware
    implementation("org.apache.groovy:groovy:4.0.0")
    implementation("org.spockframework:spock-core:2.4-M4-groovy-4.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")

    // Selenium
    implementation("org.seleniumhq.selenium:selenium-java:4.18.1")

    //Playwright
    implementation("com.microsoft.playwright:playwright:1.42.0")



}

tasks {
    test {
        useJUnitPlatform()
    }
}
