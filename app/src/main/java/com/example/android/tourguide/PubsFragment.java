package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PubsFragment extends Fragment {
    public PubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.pub_el_abuelo),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.pub_el_abuelo));
        attractions.add(new Attraction(getString(R.string.pub_el_invento),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.pub_el_invento));
        attractions.add(new Attraction(getString(R.string.pub_lo_interesante),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.pub_lo_interesante));
        attractions.add(new Attraction(getString(R.string.pub_the_old_pub),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.pub_the_old_pub));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_pubs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attractions_list.xmlist.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
