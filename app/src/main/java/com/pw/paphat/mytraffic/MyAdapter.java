package com.pw.paphat.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by paphat on 12/27/2015 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContex;
    private String[] titlestrings, detailStrings;
    private int[] iconInts;

    public MyAdapter(Context objContex, String[] titlestrings, String[] detailStrings, int[] iconInts) {
        this.objContex = objContex;
        this.titlestrings = titlestrings;
        this.detailStrings = detailStrings;
        this.iconInts = iconInts;
    } //Constructor


    @Override
    public int getCount() {
        return titlestrings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.my_listview,parent,false);//false is no use security

        //for TextView
        TextView titleTextView = (TextView) objView.findViewById(R.id.textView1);
        titleTextView.setText(titlestrings[position]);

        TextView detailTextView = (TextView) objView.findViewById(R.id.textView2);
        detailTextView.setText(detailStrings[position]);//send detailtext

        //icon
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[position]);//send photos


        return objView;
    }
}   //Main Class
