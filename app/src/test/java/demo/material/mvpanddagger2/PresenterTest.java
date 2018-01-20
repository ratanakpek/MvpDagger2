package demo.material.mvpanddagger2;

import org.junit.Before;
import org.junit.Test;

import demo.material.mvpanddagger2.mvp.LoginActivityMVP;
import demo.material.mvpanddagger2.mvp.LoginActivityPresenter;
import demo.material.mvpanddagger2.mvp.User;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyZeroInteractions;


/**
 * Created by r.pek on 1/20/2018.
 */

public class PresenterTest {
    LoginActivityMVP.Model mockLoginModel;
    LoginActivityMVP.View mockView;
    LoginActivityPresenter presenter;
    User user;

    @Before
    public void setup(){
        mockLoginModel = mock(LoginActivityMVP.Model.class);
        user = new User(1, "Hello", "World");
       // when(mockLoginModel.getUser()).thenReturn(user);


        mockView= mock(LoginActivityMVP.View.class);
        presenter= new LoginActivityPresenter(mockLoginModel);
        presenter.setView(mockView);

    }

    @Test
    public void noInteractionWithView(){
        presenter.getCurrentUser();
        verifyZeroInteractions(mockView);
    }

}
