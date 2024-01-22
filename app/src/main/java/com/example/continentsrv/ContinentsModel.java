package com.example.continentsrv;

import java.io.Serializable;

public class ContinentsModel implements Serializable {
    private String continentImg;
    private String continentName;

    public ContinentsModel(String continentImg, String continentName) {
        this.continentImg = continentImg;
        this.continentName = continentName;
    }

    public String getContinentImg() {
        return continentImg;
    }

    public void setContinentImg(String continentImg) {
        this.continentImg = continentImg;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
}
