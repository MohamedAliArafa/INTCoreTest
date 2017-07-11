package com.zeowls.intcoretest;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            Resources res = getResources();
            Configuration newConfig = new Configuration(res.getConfiguration());
            Locale locale = new Locale("ar");
            newConfig.locale = locale;
            newConfig.setLocale(locale);
            newConfig.setLayoutDirection(locale);
            res.updateConfiguration(newConfig, null);
        }

        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        Drawable progress = ratingBar.getProgressDrawable();
        Drawable noProgress = ratingBar.getIndeterminateDrawable();
        DrawableCompat.setTint(progress, getResources().getColor(R.color.yellow));
        DrawableCompat.setTint(noProgress, getResources().getColor(R.color.lightGray));
    }
}
