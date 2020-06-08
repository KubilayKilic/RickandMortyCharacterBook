package com.kaan.rickandmortybook;

import java.io.Serializable;

public class RickandMorty implements Serializable {

    private String name;
    private String occupation;
    private int pictureInteger;

    public RickandMorty(String name, String occupation, int pictureInteger) {
        this.name = name;
        this.occupation = occupation;
        this.pictureInteger = pictureInteger;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public int getPictureInteger() {
        return pictureInteger;
    }
}
