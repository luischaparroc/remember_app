package com.example.remember;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sign_up;
    Typeface custom_font;
    Button create_account, log_in;
    EditText edit_name;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sign_up = (TextView) findViewById(R.id.text_sign_up);
        create_account = (Button) findViewById(R.id.button_create_account);
        log_in = (Button) findViewById(R.id.button_log_in);
        edit_name = (EditText) findViewById(R.id.edit_name);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Gotham-Light.ttf");
        sign_up.setTypeface(custom_font);
        create_account.setTypeface(custom_font);
        log_in.setTypeface(custom_font);
        edit_name.setTypeface(custom_font);
    }

    public void register(View view)
    {
        Intent firstpage=new Intent(this,FirstPage.class);
        startActivity(firstpage);
        this.finish();
    }

    public void enter(View view)
    {
        Intent enter=new Intent(this,Home.class);
        startActivity(enter);
        this.finish();
    }
}
