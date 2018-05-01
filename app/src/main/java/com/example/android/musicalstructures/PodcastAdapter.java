package com.example.android.musicalstructures;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PodcastAdapter extends ArrayAdapter<Podcast> {
    PodcastAdapter(Context context, ArrayList<Podcast> podcasts) {
        super(context, 0, podcasts);
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
