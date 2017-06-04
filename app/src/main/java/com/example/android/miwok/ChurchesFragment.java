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


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class ChurchesFragment extends Fragment {

    public ChurchesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create a list of words
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.church_ann, R.string.desc_church_ann,
                R.drawable.churches_ann));
        locations.add(new Location(R.string.church_audoen, R.string.desc_church_audoen,
                R.drawable.churches_audeon));
        locations.add(new Location(R.string.church_christ, R.string.desc_church_christ,
                R.drawable.churches_christ));
        locations.add(new Location(R.string.church_church, R.string.desc_church_church,
                R.drawable.churches_church));
        locations.add(new Location(R.string.church_patrick, R.string.desc_church_patrick,
                R.drawable.churches_patrick));
        locations.add(new Location(R.string.church_tourist, R.string.desc_church_tourist,
                R.drawable.churches_tourism));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_churches);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_listlist.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
