/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the museums category and set a click listener on that View
        TextView museums = (TextView) findViewById(R.id.museums);
        museums.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the museums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the parks category and set a click listener on that View
        TextView parks = (TextView) findViewById(R.id.parks);
        parks.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the pubs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ParksActivity}
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);

                // Start the new activity
                startActivity(parksIntent);
            }
        });

        // Find the View that shows the shopping_centers category and set a click listener on that View
        TextView shoppingCentersTextView = (TextView) findViewById(R.id.shopping_centers);
        shoppingCentersTextView.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingCentersActivity}
                Intent shoppingCentersIntent = new Intent(MainActivity.this, ShoppingCentersActivity.class);

                // Start the new activity
                startActivity(shoppingCentersIntent);
            }
        });

        // Find the View that shows the pubs category and set a click listener on that View
        TextView pubs = (TextView) findViewById(R.id.pubs);
        pubs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the shopping_centers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PubsActivity}
                Intent pubsIntent = new Intent(MainActivity.this, PubsActivity.class);

                // Start the new activity
                startActivity(pubsIntent);
            }
        });
    }
}