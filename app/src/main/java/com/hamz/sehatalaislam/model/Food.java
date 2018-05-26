package com.hamz.sehatalaislam.model;

/**
 * Created by Hamz on 29/04/2018.
 */

public class Food {

    int thumbnail;
    String food;

    public Food(){}

    public Food(int thumbnail,String food) {
        this.food = food;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
