package com.example.android.musicalstructures;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alanionita on 01/05/2018.
 */

public class NowPlaying extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.now_playing);

            /**
             * Find the incoming intent data and record it to variables
             */
            String episodeName = getIntent().getStringExtra("name");
            String episodeDate = getIntent().getStringExtra("date");
            String episodeDescription = getIntent().getStringExtra("description");
            String episodeLink = getIntent().getStringExtra("link");

            /**
             * Find the xml placeholders and setting them to the new value
             */

            TextView nowPlayingTitle = findViewById(R.id.now_playing_title);
            TextView nowPlayingDate = findViewById(R.id.now_playing_date);
            TextView nowPlayingDescription = findViewById(R.id.now_playing_description);
            nowPlayingTitle.setText(episodeName);
            nowPlayingDate.setText(episodeDate);
            nowPlayingDescription.setText(episodeDescription);
        }
}
