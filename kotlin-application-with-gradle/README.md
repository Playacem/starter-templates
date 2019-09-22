# Gradle Kotlin App template

This repository contains a basic Kotlin application template using Gradle with its Gradle Kotlin dsl as the build tool.

Stuff to do before commiting a project based on this template

## Manual steps before usable

- Create desired package structure in `src/main/kotlin` and `src/test/kotlin`.
- Set values in the `application` block in `build.gradle.kts`
	- group
	- applicationName
	- mainClassName
- Run `./gradlew buildSrcVersions`
- Replace hard-coded dependency versions with their generated counterpart for easier updating.
- Check if the MIT License is the desired license.
	- Check for the correct year or year-range
