package com.example.drop.classes;

public class Chat {
    private String name;
    private int imageId;

    public Chat(String name, int imageId){
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

