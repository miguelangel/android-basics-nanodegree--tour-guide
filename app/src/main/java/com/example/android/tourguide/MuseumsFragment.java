package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of museums.
 */
public class MuseumsFragment extends Fragment {
    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of museums
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.museo_del_prado),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.museo_del_prado));
        attractions.add(new Attraction(getString(R.string.museo_thyssen_bornemisza),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.museo_thyssen_bornemisza));
        attractions.add(new Attraction(getString(R.string.museo_ciencias_naturales),
                getString(R.string.day_tuesday) + getString(R.string.hash) + getString(R.string.day_wednesday),
                R.drawable.museo_ciencias_naturales));
        attractions.add(new Attraction(getString(R.string.museo_arqueologico),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_thursday),
                R.drawable.museo_arqueologico));
        attractions.add(new Attraction(getString(R.string.museo_del_tren),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.museo_del_tren));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attractions_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}