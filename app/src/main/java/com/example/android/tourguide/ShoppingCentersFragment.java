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
public class ShoppingCentersFragment extends Fragment {

    public ShoppingCentersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        // Create a list of attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(getString(R.string.centro_comercial_el_corte_ingles),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.centro_comercial_el_corte_ingles));
        attractions.add(new Attraction(getString(R.string.centro_comercial_hipercor),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_friday),
                R.drawable.centro_comercial_hipercor));
        attractions.add(new Attraction(getString(R.string.centro_comercial_parquesur),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_saturday),
                R.drawable.centro_comercial_parquesur));
        attractions.add(new Attraction(getString(R.string.centro_comercial_poly),
                getString(R.string.day_monday) + getString(R.string.hash) + getString(R.string.day_sunday),
                R.drawable.centro_comercial_poly));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_shopping_centers);

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
