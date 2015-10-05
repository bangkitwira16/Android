package com.story.cyanlabs.imagetarget.Apps.ui.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.story.cyanlabs.imagetarget.Apps.app.ImageTargets;
import com.story.cyanlabs.imagetarget.R;

public class Splash_Activity extends Activity {

        private static long SPLASH_MILLIS = 450;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        LayoutInflater inflater = LayoutInflater.from(this);
        RelativeLayout layout = (RelativeLayout) inflater.inflate(
                R.layout.activity_splash_, null, false);

        addContentView(layout, new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

        final android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new Runnable()
        {

            @Override
            public void run()
            {

                Intent intent = new Intent(Splash_Activity.this,
                        ImageTargets.class);
                startActivity(intent);

            }

        }, SPLASH_MILLIS);




    }
}
