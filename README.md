Android Kotlin View Binding Demo
===========================

使用Android提供的[View Binding](https://developer.android.com/topic/libraries/view-binding)功能，可以代替手动`findViewById`

注意：
1. 需要在`build.gradle`中开启`buildFeatures { viewBinding = true }`
2. Android会自动为某个Activity生成一个Binding类，可直接引用
3. 使用`ActivityMainBinding.inflate(layoutInflater)`获取binding
4. 通过`binding.textField1`等可以引用UI上的某个view，并对其操作
5. 如果两个EditText之间互相修改内容，需要在更新前做检查以防止无限触发

Run `ActivityMain.kt` from your IDE.

