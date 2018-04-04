package com.fyp.my_application_student_planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SigninActivity extends AppCompatActivity {

    TextView forgotPassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        forgotPassword= (TextView) findViewById(R.id.forgotpassword);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPasswordIntent = new Intent(SigninActivity.this, ForgotPasswordActivity.class);
                startActivity(forgotPasswordIntent);
            }
        });

        login= (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SigninActivity.this, ContentsActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
