package comapps.com.thecapitolpubdallas.drinks;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import comapps.com.thecapitolpubdallas.R;

public class BeersListViewAdapter extends BaseAdapter {


    Context context;
    List<BeerListObject> beerObject;


    public BeersListViewAdapter(Context context, List<BeerListObject> beerObject) {

        this.context = context;
        this.beerObject = beerObject;

    }


    @Override
    public int getCount() {
        return beerObject.size();
    }

    @Override
    public Object getItem(int position) {
        return beerObject.get(position);
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
            view = inflater.inflate(R.layout.beerlistrow, parent, false);

            holder = new ViewHolder();

            holder.beername = (TextView) view.findViewById(R.id.nameTxt);
            holder.beerwherefrom = (TextView) view.findViewById(R.id.wherefromTxt);
            holder.abvlabel = (TextView) view.findViewById(R.id.abvTxtlabel);
            holder.beerabv = (TextView) view.findViewById(R.id.abvTxt);
            holder.beerabout = (TextView) view.findViewById(R.id.aboutTxt);
            holder.beerprice = (TextView) view.findViewById(R.id.priceTxt);
            holder.beersize = (TextView) view.findViewById(R.id.sizeTxt);
            holder.abvlayout = (LinearLayout) view.findViewById(R.id.abvLayout);

            //holder.beerimage = (ImageView) view.findViewById(R.id.beerimage);

            view.setTag(holder);

        } else {

            holder = (ViewHolder) view.getTag();

        }


        // Set the results into TextViews
        BeerListObject object = beerObject.get(position);

        String tempAbv = "";

        if ( object.getBeerAbv() == null ) {
            tempAbv = "0.0";
        } else {
            tempAbv = (object.getBeerAbv().toString());
        }



        if ( tempAbv == "0.0") {
            holder.abvlayout.setVisibility(View.GONE);
        } else {
            holder.abvlayout.setVisibility(View.VISIBLE);
        }

        String tempSize = (object.getBeerSize());
        if ( tempSize == null )  {
            holder.beersize.setVisibility(View.GONE);
        } else {
            holder.beersize.setVisibility(View.VISIBLE);
        }

        String tempAbout = (object.getBeerAbout());
        if ( tempAbout == null ) {
            holder.beerabout.setVisibility(View.GONE);
        } else {
            holder.beerabout.setVisibility(View.VISIBLE);
        }

        String tempWhereFrom = (object.getBeerWhereFrom());
        if ( tempWhereFrom == null ) {
            holder.beerwherefrom.setVisibility(View.GONE);
        } else {
            holder.beerwherefrom.setVisibility(View.VISIBLE);
        }


        holder.beername.setText(object.getBeerName());
        holder.beerwherefrom.setText(object.getBeerWhereFrom());
        holder.beerabv.setText(tempAbv);
        holder.beersize.setText(object.getBeerSize());
        holder.beerabout.setText(object.getBeerAbout());
        holder.beerprice.setText(object.getBeerPrice());



        Typeface font = Typeface.createFromAsset(context.getAssets(), "fonts/Garamond-Premier-Pro_19595.ttf");
        holder.beername.setTypeface(font);
        holder.beerwherefrom.setTypeface(font);
        holder.beerabv.setTypeface(font);
        holder.beersize.setTypeface(font);
        holder.beerabout.setTypeface(font);
        holder.beerprice.setTypeface(font);
        holder.abvlabel.setTypeface(font);

      //  Picasso.with(context).load(object.getBeerImage()).resize(200, 400).into(holder.beerimage);

        return view;


    }


    private static class ViewHolder {
        TextView beername;
        TextView beerwherefrom;
        TextView beerabv;
        TextView beersize;
        TextView beerprice;
        TextView beerabout;
        TextView abvlabel;
        LinearLayout abvlayout;
    }


}