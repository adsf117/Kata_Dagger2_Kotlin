package puzzlebench.com.dagger2_kotlin_kata

import android.app.Activity
import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import puzzlebench.com.dagger2_kotlin_kata.di.DaggerContactListComponent
import timber.log.Timber
import javax.inject.Inject

class AppContactList : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatcher: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        DaggerContactListComponent.builder().application(this).build().inject(this)
    }

    override fun activityInjector() = activityDispatcher
}