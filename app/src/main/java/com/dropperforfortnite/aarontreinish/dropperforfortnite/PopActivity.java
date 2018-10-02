package com.dropperforfortnite.aarontreinish.dropperforfortnite;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;


public class PopActivity extends Activity {


    Button btn_close;
    public static TextView textView;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        btn_close = (Button) findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        int randomLocation = (int) (Math.random() * dropLocations.length);
        System.out.println(dropLocations[randomLocation]);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(dropLocations[randomLocation]);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Burbank Big Condensed Black.ttf");
        textView.setTypeface(typeface);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.3));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

    }

    final String[] dropLocations = {"Junk Junction", "Haunted Hills", "Pleasant Park", "Snobby Shores", "Soccer Field", "Viking Village", "Flush Factory", "The Factoy", "Big Chair", "Shifty Shafts", "Tilted Towers", "Loot Lake", "Lazy Links", "Dusty Divot", "Salty Springs", "Fatal Fields", "Lucky Landing", "Paradise Palms", "Retail Row", "Shipment Yard", "Tomato Temple", " Risky Reels", "Wailing Woods", "Lonely Lodge", "Race Track", "Super Villain Base", "Giant Lama"};



}
