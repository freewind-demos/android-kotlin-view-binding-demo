Android Hello World Project
===========================

需要在`app/build.gradle`中增加：

```
sourceSets {
    main.java.srcDirs += 'src/main/kotlin/'
    test.java.srcDirs += 'src/test/kotlin/'
    androidTest.java.srcDirs += 'src/androidTest/Kotlin'
}
```

这样才能识别`kotlin`目录。否则，`.kt`文件只能放在`java`目录下。

```
./gradlew installRunDebug
```