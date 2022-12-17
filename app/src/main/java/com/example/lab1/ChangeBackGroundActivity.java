package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class ChangeBackGroundActivity extends AppCompatActivity {
    public static int RETURN_MAIN1 = 2;
    ImageView imageView;
    EditText text;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_title_actitivy);
        imageView = findViewById(R.id.imageView);

        change = (Button) findViewById(R.id.button1);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = (EditText) findViewById(R.id.text);
                String url = text.getText().toString();
                Picasso.get().load(url).into(imageView);
            }
        });

        Button save = (Button) findViewById(R.id.button2);
        save.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String background = text.getText().toString();
                intent.putExtra("trave1",background);
                setResult(RETURN_MAIN1, intent);

                finish();
            }
        }));




    }
}







