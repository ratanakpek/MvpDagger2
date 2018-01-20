package demo.material.mvpanddagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import demo.material.mvpanddagger2.di.App;
import demo.material.mvpanddagger2.mvp.LoginActivityMVP;

public class MainActivity extends AppCompatActivity implements LoginActivityMVP.View{

    private EditText firstName;
    private EditText lastName;
    private Button btnSubmit;

    @Inject
    LoginActivityMVP.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getApplicationComponent().inject(this);


        firstName=findViewById(R.id.firstName);
        lastName =findViewById(R.id.lastName);
        btnSubmit=findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return firstName.getText().toString();
    }

    @Override
    public String getlastName() {
        return lastName.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "Error the user not available!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "Firstname or Last name can not be empty!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "Save User!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String fname) {
        firstName.setText(fname);
    }

    @Override
    public void setLastName(String lname) {
        lastName.setText(lname);
    }
}
