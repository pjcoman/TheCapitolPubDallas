package comapps.com.thecapitolpubdallas.drinks;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import comapps.com.thecapitolpubdallas.R;

/**
 * Created by me on 9/29/2015.
 */
public class SeasonalDrinksListViewFragment extends ListFragment {

    int x = 0;
    private List<BeerListObject> beerObject;
    BeersListViewAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.beerlistfragment, null, false);

    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        List<ParseObject> ob;

        try {
            // Locate the class table named "stansbeers" in Parse.com
            ParseQuery<ParseObject> query = new ParseQuery<>(
                    "capitolcocktails").fromLocalDatastore();
            // Locate the column named "name" in Parse.com and order list
            // by ascending


            query.orderByAscending("name");

            ob = query.find();



            beerObject = new ArrayList<>();

            for (ParseObject drinks : ob) {
                // Locate images in flag column

                //  ParseFile image = (ParseFile) stansbeers.get("image");

                BeerListObject drink = new BeerListObject();
                drink.setBeerName((String) drinks.get("name"));
                drink.setBeerAbout((String) drinks.get("description"));
                drink.setBeerPrice((String) drinks.get("price"));

                //   beer.setBeerImage(image.getUrl());
                beerObject.add(drink);
            }

        } catch (ParseException e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        adapter = new BeersListViewAdapter(getActivity(), beerObject);
        setListAdapter(adapter);


    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getListView().setDivider(new ColorDrawable(Color.WHITE));
        getListView().setDividerHeight(5);
    }


}






















