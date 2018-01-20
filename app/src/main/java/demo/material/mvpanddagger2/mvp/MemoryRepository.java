package demo.material.mvpanddagger2.mvp;

/**
 * Created by r.pek on 1/20/2018.
 */

public class MemoryRepository implements LoginRepository {
    private User user;

    @Override
    public User getUser() {
        if(user==null){
            User user = new User(1, "Pek", "Ratanak");
            return user;
        }else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {

    }
}
