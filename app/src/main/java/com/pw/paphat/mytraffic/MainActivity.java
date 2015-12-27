package com.pw.paphat.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Button Controller
        buttonController();

        //Listview Controller
        listviewcontroller();

    }   //Main Method

    private void listviewcontroller() {

        // #1
        int[] iintIcon = {R.drawable.traffic_01,R.drawable.traffic_02,
                R.drawable.traffic_03,R.drawable.traffic_04,R.drawable.traffic_05,
                R.drawable.traffic_06,R.drawable.traffic_07,R.drawable.traffic_08,
                R.drawable.traffic_09,R.drawable.traffic_10,R.drawable.traffic_11,
                R.drawable.traffic_12,R.drawable.traffic_13,R.drawable.traffic_14,
                R.drawable.traffic_15,R.drawable.traffic_16,R.drawable.traffic_17,
                R.drawable.traffic_18,R.drawable.traffic_19,R.drawable.traffic_20};

        //#2
        String[] strtitle = new String[20];
        strtitle[0] = "Title1";
        strtitle[1] = "Title2";
        strtitle[2] = "Title3";
        strtitle[3] = "Title4";
        strtitle[4] = "Title5";
        strtitle[5] = "Title6";
        strtitle[6] = "Title7";
        strtitle[7] = "Title8";
        strtitle[8] = "Title9";
        strtitle[9] = "Title10";
        strtitle[10] = "Title11";
        strtitle[11] = "Title12";
        strtitle[12] = "Title13";
        strtitle[13] = "Title14";
        strtitle[14] = "Title15";
        strtitle[15] = "Title16";
        strtitle[16] = "Title17";
        strtitle[17] = "Title18";
        strtitle[18] = "Title19";
        strtitle[19] = "Title20";

        //#3
        String[] strDetail = getResources().getStringArray(R.array.detail_short); //pull data from detail.xml

        //Call MyAdapter
        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,strtitle,strDetail,iintIcon);
        trafficListView.setAdapter(objMyAdapter);



    }   //listviewcontroller

    private void buttonController() {

        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.cat);
                buttonMediaPlayer.start();

                //Intent to WebView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/tXSC8xBPF5U"));
                startActivity(objIntent);
            }   //Event
        });

    }   //buttonController

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.buttonok);

    }
}
