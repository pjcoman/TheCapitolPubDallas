package comapps.com.thecapitolpubdallas.whiskey;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import comapps.com.thecapitolpubdallas.R;

/**
 * Created by me on 9/29/2015.
 */
public class WhiskeysListViewAdapter extends BaseAdapter {


    Context context;
    List<WhiskeyListObject> whiskeyObject;


    public WhiskeysListViewAdapter(Context context, List<WhiskeyListObject> whiskeyObject) {

        this.context = context;
        this.whiskeyObject = whiskeyObject;

    }


    @Override
    public int getCount() {
        return whiskeyObject.size();
    }

    @Override
    public Object getItem(int position) {
        return whiskeyObject.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;


        if (view == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.whiskeylistrow, parent, false);

            holder = new ViewHolder();
            holder.name = (TextView) view.findViewById(R.id.nameTxt);
            holder.type = (TextView) view.findViewById(R.id.typeTxt);
            holder.about = (TextView) view.findViewById(R.id.aboutTxt);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // S
        //
        WhiskeyListObject object = whiskeyObject.get(position);

        holder.name.setText(object.getName());
        holder.type.setText(object.getType());
        holder.about.setText(object.getAbout());

        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Garamond-Premier-Pro_19595.ttf");
        holder.name.setTypeface(font);
        holder.type.setTypeface(font);
        holder.about.setTypeface(font);


     //   Picasso.with(context).load(object.getImage()).resize(200, 400).into(holder.image);

        return view;


    }


    public static class ViewHolder {
        TextView name;
        TextView type;
        TextView about;
    }


}