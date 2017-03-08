package com.example.android.tourguide;

/**
 * {@link Attraction} represents an attraction in a city
 * It contains a name, opening days and picture.
 */
public class Attraction {
    /** Attraction name */
    private String mName;

    /** Attraction opening days */
    private String mOpeningDays;

    /** Image resource ID for the attraction */
    private int mAttractionImageResourceId;

    /**
     * Create a new Attraction object.
     *
     * @param name is the attraction name
     * @param openingDays are the attraction opening days
     * @param imageResourceId is the resource ID for the image associated with the attraction
     */
    public Attraction(String name, String openingDays, int imageResourceId) {
        mName = name;
        mOpeningDays = openingDays;
        mAttractionImageResourceId = imageResourceId;
    }

    /**
     * Get the attraction name.
     */
    public String getName() {
        return mName;
    }

    /**
     * Get the attraction opening days.
     */
    public String getOpeningDays() {
        return mOpeningDays;
    }


    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mAttractionImageResourceId;
    }

}