plugins {
	id("org.jetbrains.kotlin.jvm") version "_"
	application
	id("com.github.johnrengelman.shadow") version "_"
}

repositories {
	mavenCentral()
	jcenter()
}

dependencies {
	// Align versions of all Kotlin components
	implementation(platform("org.jetbrains.kotlin:kotlin-bom:_"))

	// Use the Kotlin JDK 8 standard library.
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:_")

	// Use the Kotlin test library.
	testImplementation("org.jetbrains.kotlin:kotlin-test:_")

	// Use the Kotlin JUnit integration.
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit:_")
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
