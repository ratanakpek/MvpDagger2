package demo.material.mvpanddagger2.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import demo.material.mvpanddagger2.MainActivity;

/**
 * Created by r.pek on 1/20/2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {
    void inject(MainActivity target);
}
