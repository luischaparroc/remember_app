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
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Notifications extends AppCompatActivity {

    Button accept, no_accept;
    Typeface custom_font;
    Dialog alert_dialog;
    TextView text_plan;
    ImageView image_view;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);
        image_view = (ImageView) findViewById(R.id.id_image_view);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Gotham-Light.ttf");
        alert_dialog = new Dialog (this);
        alert_dialog.setContentView(R.layout.alert1);
        text_plan = (TextView) alert_dialog.findViewById(R.id.text_plan);
        text_plan.setText("Extender a PLAN ALWAYS");
        accept = (Button) alert_dialog.findViewById(R.id.button_accept);
        no_accept = (Button) alert_dialog.findViewById(R.id.button_no_accept);
        accept.setTypeface(custom_font);
        no_accept.setTypeface(custom_font);
        text_plan.setTypeface(custom_font);
        image_view.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                accept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alert_dialog.dismiss();
                    }
                });
                no_accept.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        alert_dialog.dismiss();
                    }
                });
                alert_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alert_dialog.getWindow().getAttributes().windowAnimations = R.style.DialogSlide;
                alert_dialog.show();
                alert_dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, 500);
            }
        });
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
    }

    public void messages_button(View view)
    {
        Intent messages=new Intent(this,Messages.class);
        startActivity(messages);
        this.finish();
    }
}
