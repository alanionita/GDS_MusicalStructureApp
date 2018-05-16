package com.example.android.musicalstructures;

import android.content.Intent;
import android.content.res.TypedArray;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find thumbnail and update it from the podcast thumbnails arrya
        TypedArray img = getResources().obtainTypedArray(R.array.pod_thumbnails);
        ImageView mainPodThumb = (ImageView) findViewById(R.id.main_podThuumbnail);
        mainPodThumb.setBackgroundResource(img.getResourceId(0, -1));

        /**
         * Find header_title and update it to the podcast name
         * Temporary set to a static string, but in future will be populated from a list
         * of podcasts
         */

        TextView podcastTitle = (TextView) findViewById(R.id.header_title);
        podcastTitle.setText("Philosophise This!");


        // Define the podcasts content for the app as an ArrayList<Podcast>
        final ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #117 ... Structuralism and Mythology pt. 2", "Sat, 17 March 2018, 11:50pm PDT", "Today we continue to talk about the projects of Structuralism.", "http://traffic.libsyn.com/philosophizethis/struc_pt_2_01_01.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #116 ... Structuralism and Mythology pt. 1", "Sat, 17 March 2018, 11:47pm PDT", "Today we begin talking about the initial projects of Structuralism.", "http://traffic.libsyn.com/philosophizethis/struc_pt_1_01_01.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #115 ... Structuralism and Context", "Sun, 28 January 2018, 1:05am PDT", "Today we talk about the origins of Structuralism.", "http://traffic.libsyn.com/philosophizethis/SaC_Final.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #114 ... The Frankfurt School pt. 7 - The Great Refusal", "Sat, 23 December 2017, 9:27am PDT", "Today we talk about Herbert Marcuse's concepts of The Great Refusal and The New Sensibility.", "http://traffic.libsyn.com/philosophizethis/The_Great_Refusal.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #113 ... The Frankfurt School pt. 6 - Art As A Tool For Liberation", "Fri, 1 December 2017, 8:27pm PDT", "Today we talk about the revolutionary potential of Art through the eyes of Herbert Marcuse.", "http://traffic.libsyn.com/philosophizethis/Art_as_a_tool_for_liberation.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #112 ... The Frankfurt School pt. 5 - Civilization", "Sun, 5 November 2017, 9:01pm PDT", "Today we continue our discussion of Marcuse's work Eros and Civilization.", "http://traffic.libsyn.com/philosophizethis/Eros_and_Civilization_pt_2.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #111 ... The Frankfurt School pt. 4 - Eros", "Thu, 19 October 2017, 9:41pm PDT", "Today we talk about Freud's views on civilization and the first half of Marcuse's response to them.", "http://traffic.libsyn.com/philosophizethis/Frankfurt_pt_4.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #110 ... The Frankfurt School pt. 3 - The Culture Industry", "Wed, 6 September 2017, 8:52pm PDT", "Today we talk about an important chapter from The Dialectic of Enlightenment entitled The Culture Industry.", "http://traffic.libsyn.com/philosophizethis/culture_industry.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #109 ... The Frankfurt School pt. 2 - The Enlightenment", "Fri, 25 August 2017, 6:37pm PDT", "Today we talk about the Frankfurt School critique of enlightenment style thinking and Herbert Marcuse's book One Dimensional Man.", "http://traffic.libsyn.com/philosophizethis/Frankfurt_School_part_2.mp3?dest-id=144662"));
        podcasts.add(new Podcast("Philosophize This!", "Beginner friendly if listened to in order! For anyone interested in an educational podcast about philosophy where you don't need to be a graduate-level philosopher to understand it. In chronological order, the thinkers and ideas that forged the world we live in are broken down and explained.", "Episode #108 ... The Frankfurt School pt. 1 - Introduction", "Wed, 16 August 2017, 8:12pm PDT", "Today we talk about The Frankfurt School.", "http://traffic.libsyn.com/philosophizethis/Frankfurt_School.mp3?dest-id=144662"));

        // Create a PodcastAdaptor that uses the podcasts ArrayList
        PodcastAdapter podcastAdapter = new PodcastAdapter(this, podcasts);

        // Find the listView for episodes and set the adaptor for it
        ListView listView = (ListView) findViewById(R.id.list_episodes);
        listView.setAdapter(podcastAdapter);
    }

    // TODO: activities are linked via explicit intents
    // TODO: add images in the ArrayList and pass them to relevant views
    // TODO: change two view from one PodcastAdapter mainly for podacast thumbnails
    // TODO: button behavior is determined by an OnClickListener in the Java code rather than by the android:onClick attribute in the XML Layout.

}
