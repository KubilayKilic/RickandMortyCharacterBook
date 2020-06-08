package com.kaan.rickandmortybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listView);

        RickandMorty Rick = new RickandMorty("Rick Sanchez", "Scientist, Inventor", R.drawable.rick);
        RickandMorty Morty = new RickandMorty("Morty Smith", "Student", R.drawable.morty);
        RickandMorty Beth = new RickandMorty("Beth Smith", "Horse Surgeon", R.drawable.beth);
        RickandMorty Summer = new RickandMorty("Summer Smith", "Student", R.drawable.summer);
        RickandMorty Jerry = new RickandMorty("Jerry Smith", "Beekeeper, former Advertising agent (fired), formerly held an unknown position assigned by the Galactic Federation (laid off after the Federation collapsed)", R.drawable.jerry);

        final ArrayList<RickandMorty> rickandmortyList = new ArrayList<>();
        rickandmortyList.add(Rick);
        rickandmortyList.add(Morty);
        rickandmortyList.add(Beth);
        rickandmortyList.add(Summer);
        rickandmortyList.add(Jerry);

        CustomAdapter customAdapter = new CustomAdapter(rickandmortyList, MainActivity.this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("selectedCharacter", rickandmortyList.get(position));
                startActivity(intent);

            }
        });

    }
}
