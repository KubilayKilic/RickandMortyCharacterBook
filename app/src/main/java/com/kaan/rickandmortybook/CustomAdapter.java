package com.kaan.rickandmortybook;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<RickandMorty> {

    private ArrayList<RickandMorty> rickandMorties;
    private Activity context;

    public CustomAdapter (ArrayList<RickandMorty> rickandMorties, Activity context) {
        super(context, R.layout.custom_view, rickandMorties);
        this.rickandMorties = rickandMorties;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null, true);

        TextView nameView = customView.findViewById(R.id.customTextView);
        nameView.setText(rickandMorties.get(position).getName());

        return customView;
    }
}
