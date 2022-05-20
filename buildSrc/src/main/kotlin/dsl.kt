import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

val DependencyHandlerScope.common
    get() = project(":kra-common")
val DependencyHandlerScope.vortex
    get() = project(":kra-vortex")
val DependencyHandlerScope.bonfire
    get() = project(":kra-bonfire")
val DependencyHandlerScope.delta
    get() = project(":kra-delta")
