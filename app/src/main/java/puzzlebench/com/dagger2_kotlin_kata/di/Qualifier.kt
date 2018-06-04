package puzzlebench.com.dagger2_kotlin_kata.di

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ServerVersionToUse(val value: String = "")