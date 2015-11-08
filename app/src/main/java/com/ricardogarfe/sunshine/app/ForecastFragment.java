package com.ricardogarfe.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class ForecastFragment extends Fragment {

    public ForecastFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        List<String> weatherPrevisions = new ArrayList<>();
        weatherPrevisions.add("Today - Sunny - 88/63");
        weatherPrevisions.add("Tomorrow - Sunny - 70/63");
        weatherPrevisions.add("Mon - Sunny - 88/63");
        weatherPrevisions.add("Thu - Sunny - 88/63");
        weatherPrevisions.add("Wed - Sunny - 88/63");

        ArrayAdapter<String> mForecastAdapter =
                new ArrayAdapter<>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast,
                        weatherPrevisions);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);

        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
