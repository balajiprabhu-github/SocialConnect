package com.balajiprabhu.socialconnect.di;


import com.balajiprabhu.socialconnect.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract MainActivity providesMainActivity();
}
