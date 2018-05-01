package com.example.android.musicalstructures;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcast> {
    private Context context;

    PodcastAdapter(Context context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View customView = convertView;
        if (customView == null) {
            customView = LayoutInflater.from(getContext()).inflate(
                    R.layout.episode_list_item, parent, false
            );
            ImageButton episode_play_button = (ImageButton) customView.findViewById(R.id.episode_list_play_button);
            episode_play_button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent nowPlayingSubviewIntent = new Intent(context.getApplicationContext(), NowPlaying.class);
                    context.startActivity(nowPlayingSubviewIntent);
                    Log.d("message", "it works");
                }
            });;
        }

        /**
         * Get {@link Podcast item} at this position in the list
         */

        Podcast arrayListItem = getItem(position);

        /**
         * Find the TextViews from the {@link episode_list_item.xml} layout
         */

        //
        TextView episodeName = (TextView) customView.findViewById(R.id.episode_title);
        TextView episodeDate = (TextView) customView.findViewById(R.id.episode_date);

        /*
            Set the values in the episode_list_item.xml to the values from the
            current {@link Podcast item} in the list, after checking that arrayListItem
            is not null
        */
        if (arrayListItem != null) {
            episodeName.setText(arrayListItem.getEpisodeName());
            episodeDate.setText(arrayListItem.getEpisodeDate());
        }

        // Return the updated episode_list_item.xml view to it can be included in the list view
        return customView;
    }

}
