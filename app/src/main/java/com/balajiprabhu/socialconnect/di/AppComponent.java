package com.balajiprabhu.socialconnect.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, ActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<BaseApplication> {


}
