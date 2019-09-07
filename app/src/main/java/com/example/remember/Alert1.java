package com.example.remember;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Alert1 extends Activity {
    Typeface custom_font;
    Button accept, no_accept;
    TextView text_plan;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert1);
        custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Gotham-Light.ttf");
        text_plan = (TextView) findViewById(R.id.text_plan);
        accept = (Button) findViewById(R.id.button_accept);
        no_accept = (Button) findViewById(R.id.button_no_accept);
        accept.setTypeface(custom_font);
        no_accept.setTypeface(custom_font);
        text_plan.setTypeface(custom_font);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;

        getWindow().setLayout(width, 693);

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);
    }
}
