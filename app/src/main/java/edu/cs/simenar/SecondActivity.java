package edu.cs.simenar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;


public class SecondActivity extends AppCompatActivity {
    private static final String KEY_MESSAGE = "message";
    private static final String KEY_FULL_NAME = "full_name";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_EMPTY = "";
    private TextView etUserinfo;
    private TextView etMyday;
    private TextView etUMakegroup;
    private TextView etTasks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        etUserinfo = findViewById(R.id.btninfo);
        etMyday = findViewById(R.id.btnMyday);
        etUMakegroup = findViewById(R.id.btnMakeGroup);
        etTasks = findViewById(R.id.btnTasks);
        etUserinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, DashboardActivity.class);
                startActivity(i);
                finish();
            }
        });




    }
}