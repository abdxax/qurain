package com.example.abdulrahman.qurain;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Home extends AppCompatActivity {
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String []nmae=getResources().getStringArray(R.array.nams);
        final int [] so={R.raw.q1,R.raw.q2,R.raw.q3,R.raw.q4,R.raw.q5,R.raw.q6,R.raw.q7,R.raw.q8,R.raw.q9,R.raw.q10};
        ListView listView=findViewById(R.id.list);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,nmae);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer=MediaPlayer.create(Home.this,so[position]);
                mediaPlayer.start();
            }
        });
    }

    public void start(View view) {
        mediaPlayer.start();
    }

    public void stop(View view) {
        mediaPlayer.pause();
    }
}
