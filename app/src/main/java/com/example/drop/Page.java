package com.example.drop;

public class Page {
    private String name;
    private int imageId;

    public Page(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return  imageId;
    }

}