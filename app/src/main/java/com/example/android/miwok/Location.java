/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *      2017-06-03 RK: trying to transform miwok app to tourguide app
 */
package com.example.android.miwok;

/**
 * {@link Location} represents a location that the user might visit.
 * It contains LocationName IDs for the location name, LocationDescription IDs for location description and
 * image file for that location.
 */
public class Location {

    /** String resource ID for the location name*/
    private int mLocationNameId;

    /** String resource ID for the location description */
    private int mLocationDescriptionId;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this location */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param LocationNameId is the string resource ID for the location name
     * @param LocationDescriptionId is the string resource Id for the description of the location
     * @param ImageResourceId is the resource ID for the image file associated with this location
     */
    public Location(int LocationNameId, int LocationDescriptionId, int ImageResourceId) {
        mLocationNameId = LocationNameId;
        mLocationDescriptionId = LocationDescriptionId;
        mImageResourceId = ImageResourceId;
    }


    /**
     * Get the string resource ID for the location name.
     */
    public int getLocationNameId() {
        return mLocationNameId;
    }

    /**
     * Get the string resource ID for the location description.
     */
    public int getLocationDescriptionId() {
        return mLocationDescriptionId;
    }

    /**
     * Return the image resource ID of the location.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}