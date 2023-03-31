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
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        TextView numbersView = (TextView) findViewById(R.id.numbers);
        numbersView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbersIntent);
                Toast.makeText(view.getContext(), R.string.welcome_numbers, Toast.LENGTH_SHORT).show();
            }
        });

        TextView colorsView = (TextView) findViewById(R.id.colors);
        colorsView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
                Toast.makeText(view.getContext(), R.string.welcome_colors, Toast.LENGTH_SHORT).show();
            }
        });

        TextView familyView = (TextView) findViewById(R.id.family);
        familyView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(familyIntent);
                Toast.makeText(view.getContext(), R.string.welcome_family, Toast.LENGTH_SHORT).show();
            }
        });

        TextView phrasesView = (TextView) findViewById(R.id.phrases);
        phrasesView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
                Toast.makeText(view.getContext(), R.string.welcome_phrases, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
