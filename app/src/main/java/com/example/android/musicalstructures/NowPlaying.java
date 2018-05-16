package com.example.android.musicalstructures;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
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

            /**
             * Find the collapse button and add a click listener that returns the
             * user to the list view
             */

            ImageButton collapseButton = (ImageButton) findViewById(R.id.now_playing_collapse_button);
            collapseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });


        }
}
