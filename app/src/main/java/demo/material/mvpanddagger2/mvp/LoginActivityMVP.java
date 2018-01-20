package demo.material.mvpanddagger2.mvp;

/**
 * Created by r.pek on 1/20/2018.
 */

public interface LoginActivityMVP {

    /**
     * Handle method like :
     * - From Presenter to view
     * - show any validation to view
     * */

    interface View{

        /**
         * From Presenter to view
         * */
        void setFirstName(String fname);
        void setLastName(String lname);

        /**
         * From View to Presenter
         * */
        String getFirstName();
        String getlastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSavedMessage();



    }


    interface  Presenter{
        void setView(LoginActivityMVP.View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface Model{
        void creatUser(String fname, String lname);
        User getUser();
    }
}
