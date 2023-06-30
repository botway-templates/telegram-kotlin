plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.22"
    kotlin("plugin.serialization") version "1.8.22"
    application
}

repositories {
    mavenCentral()

    maven("https://oss.sonatype.org/content/repositories/snapshots")

    maven("https://jitpack.io")
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.google.guava:guava:32.1.0-jre")

    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    
    implementation("io.github.kotlin-telegram-bot.kotlin-telegram-bot:telegram:6.1.0")

    implementation("net.mamoe.yamlkt:yamlkt:0.13.0")

    implementation("com.beust:klaxon:5.6")
}

application {
    mainClass.set("core.BotKt")
}
