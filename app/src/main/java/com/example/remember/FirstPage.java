package com.example.remember;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.varunest.sparkbutton.SparkButton;
import com.varunest.sparkbutton.SparkEventListener;

public class FirstPage extends AppCompatActivity {

    SparkButton sparkButton;
    TextView text_terms_title, text_terms_1, text_update_title, text_update_1, text_update_2, text_update_3, text_update_4;
    Typeface custom_font_light, custom_font_bold;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        text_terms_title = (TextView) findViewById(R.id.text_terms_title);
        text_terms_1 = (TextView) findViewById(R.id.text_terms_1);
        text_update_title = (TextView) findViewById(R.id.text_update_title);
        text_update_1 = (TextView) findViewById(R.id.text_update_1);
        text_update_2 = (TextView) findViewById(R.id.text_update_2);
        text_update_3 = (TextView) findViewById(R.id.text_update_3);
        text_update_4 = (TextView) findViewById(R.id.text_update_4);
        custom_font_light = Typeface.createFromAsset(getAssets(),  "fonts/Gotham-Light.ttf");
        custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/Gotham-Bold.ttf");
        text_terms_title.setTypeface(custom_font_bold);
        text_update_title.setTypeface(custom_font_bold);
        text_terms_1.setTypeface(custom_font_light);
        text_update_1.setTypeface(custom_font_light);
        text_update_2.setTypeface(custom_font_light);
        text_update_3.setTypeface(custom_font_light);
        text_update_4.setTypeface(custom_font_light);
        sparkButton = (SparkButton) findViewById(R.id.spark_button);

        sparkButton.setEventListener(new SparkEventListener() {
            @Override
            public void onEvent(ImageView button, boolean buttonState) {

            }

            @Override
            public void onEventAnimationEnd(ImageView button, boolean buttonState) {
                Toast.makeText(getApplicationContext(), "Bienvenido, Jose", Toast.LENGTH_SHORT).show();
                Intent home=new Intent(getApplicationContext(),Home.class);
                startActivity(home);
            }

            @Override
            public void onEventAnimationStart(ImageView button, boolean buttonState) {

            }
        });
    }


    public void trial_mode(View view)
    {
        Intent home=new Intent(this,Home.class);
        startActivity(home);
        this.finish();
    }
}