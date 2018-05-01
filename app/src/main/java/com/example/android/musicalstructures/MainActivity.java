package com.example.android.musicalstructures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("test1", "21 March 2018", "This is a test", "www.link.com"));
        podcasts.add(new Podcast("test2", "23 March 2018", "This is a test", "www.link.com"));
        PodcastAdapter podcastAdapter = new PodcastAdapter(this, podcasts);

        ListView listView = (ListView) findViewById(R.id.list_episodes);
        listView.setAdapter(podcastAdapter);
    }
}
