package puzzlebench.com.dagger2_kotlin_kata.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import puzzlebench.com.dagger2_kotlin_kata.ContactListActivity

@Module
abstract class ContactListContributor {
    @ContributesAndroidInjector
    abstract fun contactListActivity(): ContactListActivity
}