plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    application
	id("com.github.johnrengelman.shadow") version "5.2.0"
	id("de.fayard.buildSrcVersions") version "0.6.1"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application
	group = "TODO"
	version = App.VERSION
	applicationName = "Template-TODO"
    mainClassName = "TODO"
}

tasks {
	// Target Java 8 with Kotlin
	withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
	}
	// use ALL as the default distributionType
	withType<Wrapper> {
		distributionType = Wrapper.DistributionType.ALL
	}
}

