package com.example.team.hotpot;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class AdminView extends AppCompatActivity {

    Button b1;
    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_view);
        String[] mobileArray = {"Closer - The Chainsmokers","Starboy - The Weekend","Heathens - twenty one pilots","Cold Water - Major Lazer","Let Me Love You - DJ Snake","Broccoli - D.R.A.M.","Treat You Better - Shawn Mendes","Cheap Thrills - Sia"};

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_playlist, mobileArray);

        ListView listView = (ListView) findViewById(R.id.admin_music_list);
        listView.setAdapter(adapter);

        Intent intent = getIntent();

        b1 = (Button) findViewById(R.id.button7);

        progress=new ProgressDialog(this);
        progress.setMessage("Creating server...");
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setProgress(0);
        progress.show();

        final int totalProgressTime = 100;
        final Thread t = new Thread() {
            @Override
            public void run() {
                int jumpTime = 0;

                while(jumpTime < totalProgressTime) {
                    try {
                        sleep(200);
                        jumpTime += 5;
                        progress.setProgress(jumpTime);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();

                    }
                }progress.dismiss();
            }

        };
        t.start();

    }

    public void goBack2(View view) {
        Intent intent = new Intent(this, CreateRoom.class);
        startActivity(intent);

    }


}
