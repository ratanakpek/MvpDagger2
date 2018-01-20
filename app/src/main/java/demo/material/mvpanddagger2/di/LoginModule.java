package demo.material.mvpanddagger2.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import demo.material.mvpanddagger2.mvp.LoginActivityMVP;
import demo.material.mvpanddagger2.mvp.LoginActivityPresenter;
import demo.material.mvpanddagger2.mvp.LoginModel;
import demo.material.mvpanddagger2.mvp.LoginRepository;
import demo.material.mvpanddagger2.mvp.MemoryRepository;

/**
 * Created by r.pek on 1/20/2018.
 */

@Module
public class LoginModule {

        @Provides
        public LoginActivityMVP.Presenter proviceLoginActivityPresenter(LoginActivityMVP.Model model){
            return new LoginActivityPresenter(model);
        }

        @Provides
        public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
            return new LoginModel(repository);
        }

        @Provides
        public LoginRepository provideLoginRepository(){
            return new MemoryRepository();
        }
}
