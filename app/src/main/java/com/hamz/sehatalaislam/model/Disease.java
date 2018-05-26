package com.hamz.sehatalaislam.model;

/**
 * Created by Hamz on 29/04/2018.
 */

public class Disease {

    int image;
    String disease;

    public Disease(){};

    public Disease(int image, String disease) {
        this.image = image;
        this.disease = disease;
    }

    public int getImage() {
        return image;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
