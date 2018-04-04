package com.fyp.my_application_student_planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    TextView alreadymember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        alreadymember = (TextView) findViewById(R.id.alreadymember);

        alreadymember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alreadymemberintent = new Intent(SignupActivity.this, SigninActivity.class);
                startActivity(alreadymemberintent);
            }
        });
    }
}
