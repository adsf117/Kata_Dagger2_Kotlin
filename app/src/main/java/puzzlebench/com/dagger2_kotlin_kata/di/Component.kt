package puzzlebench.com.dagger2_kotlin_kata.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import puzzlebench.com.dagger2_kotlin_kata.AppContactList
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,
    ContactListContributor::class,
    DataModule::class])
interface ContactListComponent {
    fun inject(app: AppContactList)
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): ContactListComponent
    }
}