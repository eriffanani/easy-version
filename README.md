# Android Easy Version
This is a shortcut code to simplify for checking what Android version is used in the devices.

## Installation

### settings.gradle.kts
```gradle
dependencyResolutionManagement {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### build.gradle (Module :app)
```gradle
implementation("com.github.eriffanani:easy-version:1.0.1")
```

### build.gradle (Module :app) For Kotlin
```gradle
implementation("com.github.eriffanani:easy-version-ktx:1.0.1")
```

## How to use
* Java
```java
if (AndroidVersion.Tiramisu13()) {
  // TODO ACTION  
} else if (AndroidVersion.Snow12()) {
  // TODO ACTION
} else {
  // TODO ACTION
}
```
```java
if (AndroidVersion.Snow12AndUp()) {
  // TODO ACTION  
} else if (AndroidVersion.QuinceTart10AndDown()){
  // TODO ACTION  
}
```

* Kotlin
```kotlin
AndroidVersion.`Tiramisu-13` {
  // TODO ACTION
} ?: AndroidVersion.`Snow-12` {
  // TODO ACTION
}               
```
```kotlin
val value = AndroidVersion.`RedVelvet-11`.andUp { 
  "My value 11"
} ?: AndroidVersion.`QuinceTart-10`.andDown {
  "My value 10"
} ?: {
  "My other value"
}
```
