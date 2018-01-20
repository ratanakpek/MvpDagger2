package demo.material.mvpanddagger2.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by r.pek on 1/20/2018.
 */

@Module
public class ApplicationModule {
    private Application application;

    public ApplicationModule(Application application){
        this.application=application;
    }

    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}
