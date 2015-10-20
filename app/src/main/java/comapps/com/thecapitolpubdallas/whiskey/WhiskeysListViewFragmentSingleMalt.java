package comapps.com.thecapitolpubdallas.whiskey;


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
public class WhiskeysListViewFragmentSingleMalt extends ListFragment {


    private List<WhiskeyListObject> whiskeyObject;
    WhiskeysListViewAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.whiskeylistfragment, null, false);
    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        List<ParseObject> ob;

        try {
            // Locate the class table named "stansbeers" in Parse.com
            ParseQuery<ParseObject> query = new ParseQuery<>(
                    "capitolwhiskeys").fromLocalDatastore();
            // Locate the column named "name" in Parse.com and order list
            // by ascending


            query.orderByAscending("name").whereEqualTo("group", "SINGLE_MALT_SCOTCH");

            ob = query.find();



            whiskeyObject = new ArrayList<>();

            for (ParseObject whiskeys : ob) {
                // Locate images in flag column



                WhiskeyListObject whiskey = new WhiskeyListObject();
                whiskey.setName((String) whiskeys.get("name"));
                whiskey.setGroup((String) whiskeys.get("group"));
                whiskey.setType((String) whiskeys.get("type"));
                whiskey.setAbout((String) whiskeys.get("description"));
                whiskeyObject.add(whiskey);
            }


        } catch (ParseException e) {
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        adapter = new WhiskeysListViewAdapter(getActivity(), whiskeyObject);
        setListAdapter(adapter);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getListView().setDivider(new ColorDrawable(Color.WHITE));
        getListView().setDividerHeight(5);
    }
}



