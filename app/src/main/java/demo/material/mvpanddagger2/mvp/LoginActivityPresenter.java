package demo.material.mvpanddagger2.mvp;

import android.support.annotation.Nullable;

/**
 * Created by r.pek on 1/20/2018.
 */

public class LoginActivityPresenter implements LoginActivityMVP.Presenter {

    @Nullable
    LoginActivityMVP.View view;
    LoginActivityMVP.Model model;

    public LoginActivityPresenter(LoginActivityMVP.Model model) {
        this.model = model;
    }

    @Override
    public void setView(LoginActivityMVP.View view) {
        this.view=view;
    }

    @Override
    public void loginButtonClicked() {
        if(view!=null){
            if(view.getFirstName().trim().equals("")||view.getlastName().trim().equals("")){
                view.showInputError();
            }else{
                model.creatUser(view.getFirstName(), view.getlastName());
                view.showUserSavedMessage();
            }
        }
    }

    @Override
    public void getCurrentUser() {
        User user = model.getUser();
        if(user==null){
            if(view!=null){
                view.showUserNotAvailable();
            }
        }else{
            if(view!=null){
                view.setFirstName(user.getFirstName());
                view.setLastName(user.getLastName());
            }
        }
    }
}
