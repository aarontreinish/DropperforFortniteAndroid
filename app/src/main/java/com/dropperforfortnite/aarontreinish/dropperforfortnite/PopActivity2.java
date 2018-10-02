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

public class PopActivity2 extends Activity {


    Button btn_close2;
    public static TextView textView2;
    Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop2);

        btn_close2 = (Button) findViewById(R.id.btn_close2);
        btn_close2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        int randomLocation = (int) (Math.random() * fortniteChallenges.length);
        System.out.println(fortniteChallenges[randomLocation]);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText(fortniteChallenges[randomLocation]);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Burbank Big Condensed Black.ttf");
        textView2.setTypeface(typeface);

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

    final String[] fortniteChallenges = {"0 Kill Win Challenge", "No Meds Challenge", "One Gun Only Challenge", "Impulse Only Challenge", "Grenade Only Challenge", "C4 Only Challenge", "Traps Only Challenge", "Sniper Only Challenge", "Pistol Only Challenge", "Hand Cannon Only Challenge", "One Chest Only Challenge", "Hunting Rifle Only Challenge", "No Reload Challenge", "Minigun Only Challenge", "No Gun Challenge", "No Building Challenge", "SMG Only Challenge", "Silenced Guns Only Challenge", "Floor is Lava Challenge", "Apples Only Challenge", "Mushrooms Only Challenge", "Rainbow Gun Challenge", "Pickaxe Only Challenge", "Shotgun Only Challenge", "Stink Bomb Only Challenge", "Clingers Only Challenge", "Vending Machines Only Challenge", "Rocket Launcher Only Challenge", "Grenade Launcher Only Challenge", "Revolver Only Challenge", "Gray Guns Only Challenge", "Pick up Enemy's Loadout Challenge"};



}
