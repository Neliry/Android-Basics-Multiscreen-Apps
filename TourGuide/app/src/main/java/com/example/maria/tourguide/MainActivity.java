package com.example.maria.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });
        TextView monuments = (TextView) findViewById(R.id.monuments);
        monuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MonumentsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });
        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent museumsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });
    }
}
