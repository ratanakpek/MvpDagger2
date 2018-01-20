package demo.material.mvpanddagger2.di;

import android.app.Application;

/**
 * Created by r.pek on 1/20/2018.
 */

public class App extends Application {
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent= DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule()).build();
    }


    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
