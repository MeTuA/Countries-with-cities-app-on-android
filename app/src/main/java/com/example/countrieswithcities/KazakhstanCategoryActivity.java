package com.example.countrieswithcities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class KazakhstanCategoryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kazakhstan_category);

        ArrayAdapter<Kazakhstan> arrayAdapter = new ArrayAdapter<>(
                this,
                R.layout.my_custom_layout,
                Kazakhstan.cities
        );

        ListView listView = (ListView) findViewById(R.id.KazId);
        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(KazakhstanCategoryActivity.this, KazakhstanActivity.class);
                intent.putExtra(KazakhstanActivity.EXTRA_CITYID, (int)id);
                startActivity(intent);
            }
        };

        listView.setOnItemClickListener(onItemClickListener);
    }
}