package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangeTitleActitivy extends AppCompatActivity {

    public static int RETURN_MAIN = 1;
    private Button bt1, bt2, bt3, bt4, bt5, bt6, image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_back_ground);
        Intent intent = getIntent();
        String text = intent.getStringExtra("dulieu");
        final EditText txt = (EditText) findViewById(R.id.txt);
        txt.setText(text);

        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        bt4 = (Button) findViewById(R.id.b4);
        bt5 = (Button) findViewById(R.id.b5);
        bt6 = (Button) findViewById(R.id.b6);
        image = (Button) findViewById(R.id.button);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#d42162"));
                image.setBackgroundColor(Color.parseColor("#d42162"));
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#8e24a8"));
                image.setBackgroundColor(Color.parseColor("#8e24a8"));
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#414bac"));
                image.setBackgroundColor(Color.parseColor("#414bac"));
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#2186e0"));
                image.setBackgroundColor(Color.parseColor("#2186e0"));
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#01897d"));
                image.setBackgroundColor(Color.parseColor("#01897d"));
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setTextColor(Color.parseColor("#469e4a"));
                image.setBackgroundColor(Color.parseColor("#469e4a"));
            }
        });

        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String s = txt.getText().toString();
                String t = String.valueOf(txt.getCurrentTextColor());
                intent.putExtra("trave",s);
                intent.putExtra("mautrave",t);
                setResult(RETURN_MAIN, intent);

                finish();
            }
        });
    }
}
























