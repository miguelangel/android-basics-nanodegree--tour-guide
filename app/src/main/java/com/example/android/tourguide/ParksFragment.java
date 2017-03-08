package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of parks.
 */
public class ParksFragment extends Fragment {
    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of parks

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.parque_campo_naciones),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.parque_campo_naciones));
        attractions.add(new Attraction(getString(R.string.parque_capricho),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.parque_capricho));
        attractions.add(new Attraction(getString(R.string.parque_casa_de_campo),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.parque_casa_de_campo));
        attractions.add(new Attraction(getString(R.string.parque_europa),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.parque_europa));
        attractions.add(new Attraction(getString(R.string.parque_madrid_rio),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.parque_madrid_rio));
        attractions.add(new Attraction(getString(R.string.parque_retiro),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.parque_retiro));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_parks);

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
