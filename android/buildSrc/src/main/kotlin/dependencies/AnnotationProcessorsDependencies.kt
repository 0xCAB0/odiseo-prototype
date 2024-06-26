

package dependencies

/**
 * Project annotation processor dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */
object AnnotationProcessorsDependencies {
    const val DAGGER = "com.google.dagger:dagger-compiler:${BuildDependenciesVersions.DAGGER}"
    const val HILT = "com.google.dagger:hilt-android-compiler:${BuildDependenciesVersions.DAGGER}"
    const val DATABINDING = "com.android.databinding:compiler:${BuildDependenciesVersions.DATABINDING}"
    const val ROOM = "androidx.room:room-compiler:${BuildDependenciesVersions.ROOM}"
    const val LIFECYCLE = "androidx.lifecycle:lifecycle-compiler:${BuildDependenciesVersions.LIFECYCLE}"
}
