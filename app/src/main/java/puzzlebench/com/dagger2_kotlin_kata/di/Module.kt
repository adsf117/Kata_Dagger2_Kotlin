package puzzlebench.com.dagger2_kotlin_kata.di

import dagger.Module
import dagger.Provides
import puzzlebench.com.dagger2_kotlin_kata.model.Contact


const val SERVER1 = "Server1"
const val SERVER2 = "Server2"

@Module
class ContactSurce {
    @Provides
    @ServerVersionToUse(SERVER1)
    fun getContatcFromServiceV1(): Contact {
        return Contact("Contact From Service Version 1 Using Dagger2")
    }

    @Provides
    @ServerVersionToUse(SERVER2)
    fun getContatcFromServiceV2(): Contact {
        return Contact("Contact From Service Version 2 Using Dagger2")
    }
}