package com.fyp.my_application_student_planner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentsActivity extends AppCompatActivity {

    Button clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        clock = (Button) findViewById(R.id.clock);

        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clockIntent = new Intent(ContentsActivity.this, AlaramActivity.class);
                startActivity(clockIntent);
            }
        });
    }
}
