plugins {
    alias(libs.plugins.specxplorer.android.library)
}

android {
    namespace = "com.development.core.data"
}

dependencies {
    implementation(libs.timber)

    implementation(projects.core.domain)
}