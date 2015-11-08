package com.ricardogarfe.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    public PlaceholderFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<String> weatherPrevisions = new ArrayList<>();
        weatherPrevisions.add("Today - Sunny - 88/63");
        weatherPrevisions.add("Tomorrow - Sunny - 88/63");
        weatherPrevisions.add("Mon - Sunny - 88/63");
        weatherPrevisions.add("Thu - Sunny - 88/63");
        weatherPrevisions.add("Wed - Sunny - 88/63");

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
