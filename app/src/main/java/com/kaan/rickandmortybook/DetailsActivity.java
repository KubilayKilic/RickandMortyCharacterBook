package com.kaan.rickandmortybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = findViewById(R.id.imageView);
        TextView nameText = findViewById(R.id.nameText);
        TextView occupationText = findViewById(R.id.occupationText);

        Intent intent = getIntent();
        RickandMorty selectedMember = (RickandMorty) intent.getSerializableExtra("selectedCharacter");

        Bitmap bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), selectedMember.getPictureInteger());
        imageView.setImageBitmap(bitmap);

        nameText.setText(selectedMember.getName());
        occupationText.setText(selectedMember.getOccupation());


    }
}
