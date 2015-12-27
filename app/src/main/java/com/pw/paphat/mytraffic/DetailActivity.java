package com.pw.paphat.mytraffic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView;
    private ImageView trafficImageView;
    private TextView detailTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();



    }   //Main Method

    public void clickBack(View view) {
        finish();
    }

    private void showView() {

        //Receive value from Intent
        String strTitle = getIntent().getStringExtra("Title");
        int intImage = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index",0);

        //show title
        titleTextView.setText(strTitle);

        //show image
        trafficImageView.setImageResource(intImage);

        //show detail
       // detailTextView.setText(intIndex);

        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailStrings[intIndex]);
       // detailTextView.setText(intIndex);

    }// show View

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.detailtextview);
        detailTextView = (TextView) findViewById(R.id.detailtextview2);
        trafficImageView = (ImageView) findViewById(R.id.detailimageView);
    }
} // Main Class
