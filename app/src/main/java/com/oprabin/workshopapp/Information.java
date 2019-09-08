package com.oprabin.workshopapp;

public class Information {
    String name, description;
    int images;

    public String getName() {
        return name;
    }

    public int getImage(){
        return images;
    }

    public void setImage(int image){
        this.images = image;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
