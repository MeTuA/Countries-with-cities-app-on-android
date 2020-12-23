package com.example.countrieswithcities;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KazakhstanActivity extends AppCompatActivity {

    public static final String EXTRA_CITYID = "cityId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazakhstan);

        int cityId = (Integer) getIntent().getExtras().get(EXTRA_CITYID);
        Kazakhstan city = Kazakhstan.cities[cityId];

        ImageView imageView = (ImageView) findViewById(R.id.city_photo);
        imageView.setImageResource(city.getImageResId());
        imageView.setContentDescription(city.getDescription());

        TextView textView = (TextView) findViewById(R.id.city_name);
        textView.setText(city.getCity());

        TextView tView = (TextView) findViewById(R.id.city_desc);
        tView.setText(city.getDescription());


    }
}