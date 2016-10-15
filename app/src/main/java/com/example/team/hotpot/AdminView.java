package com.example.team.hotpot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdminView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);
        String[] mobileArray = {"Closer - The Chainsmokers","Starboy - The Weekend","Heathens - twenty one pilots","Cold Water - Major Lazer","Let Me Love You - DJ Snake","Broccoli - D.R.A.M.","Treat You Better - Shawn Mendes","Cheap Thrills - Sia"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_admin_view, mobileArray);

        ListView listView = (ListView) findViewById(R.id.music_list);
        listView.setAdapter(adapter);
    }
}
