# gradle-multi-project-build
A simple multi-project build example with two projects, `custom-lib` and `main-app`. Feel free to clone and re-use! You can read an in-depth how-to in the [Gradle Multi-Project Build blog post](https://systemsdesign.tech/gradle-multi-project-build/) on [systemsdesign.tech](https://systemsdesign.tech/). 

## Basics

The simple thing to know about a multi-project build is you need to include sub-projects within `settings.gradle`. You can put sub-projects anywhere you want in the file tree, and the second requirement is that the included directory contains a `build.gradle` file. That's about it.

## Simple Java Example

This repo uses two Java projects, one as a "library" (`custom-lib`) and the other as a "main" application (`main-app`). The `custom-lib` project is included in the `main-app` project as a dependency, and the classes are then available in `main-app`. I've also included a test for good measure.

You can run the Main application through the gradle task:
```bash
./gradlew :main-app:run
```

You can also run the single (extremely simple and mostly-not-useful test) with:
```bash
./gradlew :custom-lib:test
```
