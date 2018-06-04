package puzzlebench.com.dagger2_kotlin_kata.di

import dagger.Module
import dagger.Provides
import puzzlebench.com.dagger2_kotlin_kata.model.Contact

@Module
class ContactBag {
    @Provides
    fun getContatcFromServiceV1(): Contact {
        return Contact("Contact From Service Version 1")
    }
}