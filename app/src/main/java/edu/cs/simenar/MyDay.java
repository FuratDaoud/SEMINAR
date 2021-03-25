package edu.cs.simenar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyDay extends AppCompatActivity {
    private ImageView igMYday;
    private TextView txtMyday;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_day);
        igMYday = findViewById(R.id.imgback);
        txtMyday = findViewById(R.id.myday);


        igMYday.setOnClickListener(new View.OnClickListener() {
                @Override
            public void onClick(View v) {
                Intent i = new Intent(MyDay.this, SecondActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}