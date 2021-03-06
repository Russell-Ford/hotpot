package com.example.team.hotpot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EditPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_playlist);

        String[] mobileArray = {"Closer - The Chainsmokers","Starboy - The Weekend","Heathens - twenty one pilots","Cold Water - Major Lazer","Let Me Love You - DJ Snake","Broccoli - D.R.A.M.","Treat You Better - Shawn Mendes","Cheap Thrills - Sia"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_playlist, mobileArray);

        ListView listView = (ListView) findViewById(R.id.edit_playlist);
        listView.setAdapter(adapter);

        Intent intent = getIntent();
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
