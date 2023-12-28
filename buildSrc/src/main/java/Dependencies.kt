object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycleKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"}
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUI by lazy { "androidx.compose.ui:ui" }
    val composeUIGraphics by lazy{"androidx.compose.ui:ui-graphics"}
    val uiToolPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }
    val composeMaterial3 by lazy { "androidx.compose.material3:material3" }
    val navigation by lazy { "androidx.navigation:navigation-compose:${Versions.nav_version}" }
    val TestManifest by lazy { "androidx.compose.ui:ui-test-manifest" }
    val composeUITooling by lazy { "androidx.compose.ui:ui-tooling" }
    val jUnit4 by lazy { "androidx.compose.ui:ui-test-junit4" }
    val espresso by lazy{"androidx.test.espresso:espresso-core:${Versions.espresso}"}
    val jUnit by lazy{"junit:junit:${Versions.jUnit}"}
    val extJUnit by lazy { "androidx.test.ext:junit:${Versions.extJUnit}" }
    val lifeCycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}" }
    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroid}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
    val hiltLifeCycleViewmodel by lazy { "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifeCycleViewmodel}" }
    val hiltNavigationCompose by lazy{"androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}"}
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val Gson by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okHttp}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val moshi by lazy {"com.squareup.moshi:moshi-kotlin:${Versions.moshi}"}
    val coroutineCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineCore}" }
    val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineCore}" }
}

object Modules{
    const val utilities= ":utilities"
}