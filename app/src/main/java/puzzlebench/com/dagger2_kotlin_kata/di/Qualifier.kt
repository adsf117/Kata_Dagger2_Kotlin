package puzzlebench.com.dagger2_kotlin_kata.di

import javax.inject.Qualifier

const val SERVER1 = "Server1"
const val SERVER2 = "Server2"

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class ServerVersionToUse(val value: String = "")