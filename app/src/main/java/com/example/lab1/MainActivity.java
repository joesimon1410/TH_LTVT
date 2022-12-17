package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Intent intent, intent1;
    private Button button1, button2;
    private TextView textView;
    private ImageView imageView;

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ChangeBackGroundActivity.class);
                startActivityForResult(intent, ChangeBackGroundActivity.RETURN_MAIN1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, ChangeTitleActitivy.class);
                String a = textView.getText().toString();
                intent.putExtra("dulieu", a);
                startActivityForResult(intent, ChangeTitleActitivy.RETURN_MAIN);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ChangeBackGroundActivity.RETURN_MAIN1){
            String url = data.getStringExtra("trave1");
            Picasso.get()
                    .load(url)
                    .into(imageView);
        }
        if(requestCode == ChangeTitleActitivy.RETURN_MAIN){
            String s = data.getStringExtra("trave");
            String t = data.getStringExtra("mautrave");
            textView.setText(s);
            textView.setTextColor(Integer.parseInt(t));
        }
    }

}




