package com.example.android.musicalstructures;

/**
 * {@link Podcast} represents an object of data required by the app to play podcasts
 * and show relevant information about them
 */

public class Podcast {

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
     * @param name is the name for the episode
     * @param date is the date of the episode
     * @param description is the description of the episode
     * @param link is the link to the hosted audio file
     */

    public Podcast(String name, String date, String description, String link) {
        mEpisodeName = name;
        mEpisodeDate = date;
        mEpisodeDescription = description;
        mEpisodeAudioLink = link;
    }

    // define the getters for the variables housed in the class
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
