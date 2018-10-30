package com.example.maria.tourguide;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(   getResources().getString(R.string.museums_1_name) ,
                getResources().getString(R.string.museums_1_description),
                getResources().getString(R.string.museums_1_address),
                R.drawable.museum_1));

        places.add(new Place(   getResources().getString(R.string.museums_2_name) ,
                getResources().getString(R.string.museums_2_description),
                getResources().getString(R.string.museums_2_address),
                R.drawable.museum_2));

        places.add(new Place(   getResources().getString(R.string.museums_3_name) ,
                getResources().getString(R.string.museums_3_description),
                getResources().getString(R.string.museums_3_address),
                R.drawable.museum_3));
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_museums);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                TextView description = (TextView) view.findViewById(R.id.descriptionTextView);
                if(description.getVisibility()!= View.VISIBLE){
                    description.setVisibility(View.VISIBLE);}
                else {
                    description.setVisibility(View.GONE);}

            }
        });
    }

}