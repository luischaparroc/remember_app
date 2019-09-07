package com.example.remember;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Messages extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages);
    }

    public void home_button(View view)
    {
        Intent home=new Intent(this,Home.class);
        startActivity(home);
        this.finish();
    }

    public void profile_button(View view)
    {
        Intent profile=new Intent(this,Profile.class);
        startActivity(profile);
        this.finish();
    }

    public void notifications_button(View view)
    {
        Intent notifications=new Intent(this,Notifications.class);
        startActivity(notifications);
        this.finish();
    }

    public void messages_button(View view)
    {
    }
}
