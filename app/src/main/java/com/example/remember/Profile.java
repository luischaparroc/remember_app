package com.example.remember;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }

    public void home_button(View view)
    {
        Intent home=new Intent(this,Home.class);
        startActivity(home);
        this.finish();
    }

    public void profile_button(View view)
    {
    }

    public void notifications_button(View view)
    {
        Intent notifications=new Intent(this,Notifications.class);
        startActivity(notifications);
        this.finish();
    }

    public void messages_button(View view)
    {
        Intent messages=new Intent(this,Messages.class);
        startActivity(messages);
        this.finish();
    }
}
