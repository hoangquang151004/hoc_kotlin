plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Thư viện Coroutines đã được thêm sẵn cho bạn:
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    testImplementation(kotlin("test"))
}

// Cấu hình để Gradle nhận thư mục 'src' hiện tại của bạn làm thư mục chứa code Kotlin
sourceSets {
    main {
        kotlin.srcDirs("src")
    }
}

tasks.test {
    useJUnitPlatform()
}
