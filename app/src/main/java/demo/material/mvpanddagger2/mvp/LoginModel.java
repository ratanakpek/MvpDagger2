package demo.material.mvpanddagger2.mvp;

/**
 * Created by r.pek on 1/20/2018.
 */

public class LoginModel implements LoginActivityMVP.Model {

    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void creatUser(String fname, String lname) {
        repository.saveUser(new User(1, fname, lname));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
