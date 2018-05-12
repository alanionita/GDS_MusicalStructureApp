package com.example.android.musicalstructures;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by alanionita on 01/05/2018.
 */

public class NowPlaying extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.now_playing);

            // Find thumbnail and update it from the podcast thumbnails arrya
            TypedArray img = getResources().obtainTypedArray(R.array.pod_thumbnails);
            ImageView mainPodThumb = (ImageView) findViewById(R.id.nowPlaying_podThumbnail);
            mainPodThumb.setBackgroundResource(img.getResourceId(0, -1));

            /**
             * Find the incoming intent data and record it to variables
             */
            String episodeName = getIntent().getStringExtra("name");
            String podcastName = getIntent().getStringExtra("podName");
            String episodeDate = getIntent().getStringExtra("date");
            String episodeDescription = getIntent().getStringExtra("description");
            String episodeLink = getIntent().getStringExtra("link");

            /**
             * Find the xml placeholders and setting them to the new value
             */

            TextView nowPlayingEpTitle = findViewById(R.id.now_playing_title);
            TextView nowPlayingPodTitle = findViewById(R.id.now_playing_podTitle);
            nowPlayingEpTitle.setText(episodeName);
            nowPlayingPodTitle.setText(podcastName);

        }
}
