package com.example.android.musicalstructures;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define the podcasts content for the app as an ArrayList<Podcast>
        final ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("test1", "21 March 2018", "This is a test", "www.link.com"));
        podcasts.add(new Podcast("test2", "23 March 2018", "This is a test", "www.link.com"));

        // Create a PodcastAdaptor that uses the podcasts ArrayList
        PodcastAdapter podcastAdapter = new PodcastAdapter(this, podcasts);

        // Find the listView for episodes and set the adaptor for it
        ListView listView = (ListView) findViewById(R.id.list_episodes);
        listView.setAdapter(podcastAdapter);
    }

    // TODO: add a "Details" screen of the currently playing song
    // TODO: pass data from list view to NowPlaying screen
    // TODO: activities are linked via explicit intents
    // TODO: button behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.

}
