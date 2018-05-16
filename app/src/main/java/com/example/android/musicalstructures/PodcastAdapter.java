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
        /**
         * Get {@link Podcast item} at this position in the list
         */

        final Podcast arrayListItem = getItem(position);
        Log.i("podcast", arrayListItem.getEpisodeName());

        /**
         * Check if the existing view is being reused, otherwise inflate the view
         */
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.episode_list_item, parent, false
            );

            /**
             * Find the episode play button from the ListItem view
             */

            ImageButton episode_play_button = (ImageButton) convertView.findViewById(R.id.episode_list_play_button);

            /**
             * Set on click listener to the play button
             */
            episode_play_button.setOnClickListener(new View.OnClickListener() {
                /**
                 *
                 * OnClick uses the {@link Podcast arrayListItem} from the ArrayList
                 * to start a {@link NowPlaying} activity using the content from the arrayListItem
                 */
                public void onClick(View v) {
                    getContext().startActivity(
                            new Intent(context.getApplicationContext(), NowPlaying.class)
                                    .putExtra("name", arrayListItem.getEpisodeName())
                                    .putExtra("date", arrayListItem.getEpisodeDate())
                                    .putExtra("description", arrayListItem.getEpisodeDescription())
                                    .putExtra("link", arrayListItem.getEpisodeAudioLink())
                                    .putExtra("podName", arrayListItem.getPodcastName())
                    );

                }
            });;
        }

        /**
         * Find the TextViews from the {@link episode_list_item.xml} layout
         */

        //
        TextView episodeName = (TextView) convertView.findViewById(R.id.episode_title);
        TextView episodeDate = (TextView) convertView.findViewById(R.id.episode_date);

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
        return convertView;
    }

}
