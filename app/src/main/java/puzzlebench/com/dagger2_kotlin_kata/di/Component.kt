package puzzlebench.com.dagger2_kotlin_kata.di

import dagger.Component
import puzzlebench.com.dagger2_kotlin_kata.ContactListActivity
import javax.inject.Singleton

@Singleton @Component(modules = [ContactSurce::class])
interface ContactSurceComponent {
    fun inject(ContactListActivity: ContactListActivity)
}