# CloudDateAndTime
Get Cloud Date and Time

> Step 1. Add the JitPack repository to your build file

```gradle
allprojects {
     repositories {
     ...
     maven { url 'https://jitpack.io' }
  }
}
  ```
> Step 2. Add the dependency
```gradle
dependencies {
  // Latest version is 1.0.0
  // Remove tag with version
  implementation 'com.github.vishaltyagi807:CloudDateAndTime:Tag'
}
```
> Step 3. Code

```gradle
CloudDateAndTime cloudDateAndTime = new CloudDateAndTime(this);
// First check internet connection

```

