package com.example.android.musicalstructures;

import android.media.Image;

/**
 * {@link Podcast} represents an object of data required by the app to play podcasts
 * and show relevant information about them
 */

public class Podcast {

    // Podcast name
    private String mPodcastName;

    // Podcast description
    private String mPodcastDecription;

    // name of the episode
    private String mEpisodeName;

    // date of the episode
    private String mEpisodeDate;

    // description of the episode;
    private String mEpisodeDescription;

    // string version of the url needed for playback
    private String mEpisodeAudioLink;

    /**
     * Create a new Podcast object
     * @param podName is the name of the podcast
     * @param podDescription is the description of the podcast
     * @param epName is the name for the episode
     * @param epDate is the date of the episode
     * @param epDescription is the description of the episode
     * @param epLink is the link to the hosted audio file
     */

    public Podcast(String podName, String podDescription, String epName, String epDate, String epDescription, String epLink) {
        mPodcastName = podName;
        mPodcastDecription = podDescription;
        mEpisodeName = epName;
        mEpisodeDate = epDate;
        mEpisodeDescription = epDescription;
        mEpisodeAudioLink = epLink;

    }

    // define the getters for the variables housed in the class
    public String getPodcastName () { return mPodcastName; }

    public String getPodcastDecription () { return mPodcastDecription; }

    public String getEpisodeName () {
        return mEpisodeName;
    }

    public String getEpisodeDescription () {
        return mEpisodeDescription;
    }

    public String getEpisodeAudioLink () {
        return mEpisodeAudioLink;
    }

    public String getEpisodeDate () {
        return mEpisodeDate;
    }
}
