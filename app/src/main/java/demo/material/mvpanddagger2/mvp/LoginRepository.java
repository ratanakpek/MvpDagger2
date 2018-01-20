package demo.material.mvpanddagger2.mvp;

/**
 * Created by r.pek on 1/20/2018.
 */

public interface LoginRepository {
    User getUser();
    void saveUser(User user);
}
