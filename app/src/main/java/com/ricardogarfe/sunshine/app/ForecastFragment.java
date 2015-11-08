package com.ricardogarfe.sunshine.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_refresh) {
            FetchWeatherTask fetchWeatherTask = new FetchWeatherTask();
            fetchWeatherTask.execute("46001,ES");
            return true;
        }

        return super.onOptionsItemSelected(item);
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
