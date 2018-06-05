package puzzlebench.com.dagger2_kotlin_kata.di

import dagger.Module
import dagger.Provides
import puzzlebench.com.dagger2_kotlin_kata.model.Contact




@Module
class DataModule {
    @Provides
    @ServerVersionToUse(SERVER1)
    fun getContatcFromServiceV1(): Contact {
        return Contact("Contact From Server1 Using Dagger2")
    }

    @Provides
    @ServerVersionToUse(SERVER2)
    fun getContatcFromServiceV2(): Contact {
        return Contact("Contact From Server 2 Using Dagger2")
    }
}