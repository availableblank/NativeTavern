# Flutter
-keep class io.flutter.** { *; }

# NativeTavern
-keep class com.miaomiaoxworld.nativetavern.** { *; }

# Google Sign-In / Drive
-keep class com.google.android.gms.** { *; }
-keep class com.google.api.** { *; }

# Drift (SQLite)
-keep class io.requery.sqlite.** { *; }

# Kotlin Coroutines
-keepnames class kotlinx.coroutines.internal.MainDispatcherFactory {}
-keepnames class kotlinx.coroutines.CoroutineExceptionHandler {}