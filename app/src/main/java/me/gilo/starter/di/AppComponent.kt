package me.gilo.starter.di


import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import me.gilo.starter.StarterApp

import javax.inject.Singleton


@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, ViewModelModule::class, FirebaseModule::class, ActivitiesModule::class])
internal interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(app: StarterApp)

}
