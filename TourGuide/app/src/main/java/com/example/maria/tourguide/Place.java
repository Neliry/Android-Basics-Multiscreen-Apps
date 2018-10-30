package com.example.maria.tourguide;

public class Place {

    private String title;
    private String description;
    private String address;
    private int image_id;

    public Place(String title, String description, String address, int image_id){
        this.title=title;
        this.description=description;
        this.address=address;
        this.image_id=image_id;
    }

    public String getPpaceTitle(){
        return title;
    }

    public String getPlaceDescription(){
        return description;
    }

    public String getPlaceAddress(){
        return address;
    }

    public int getImage_id(){
        return image_id;
    }

}