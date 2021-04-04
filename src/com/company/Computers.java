package com.company;

public class Computers {
    private String videoCard;
    private String name;
    private int ram;

    public Computers(String name, String videoCard, int ram){
        this.name = name;
        this.ram = ram;
        this.videoCard = videoCard;
    }

    public String getName(){
        return name;
    }

    public String getVideoCard(){
        return videoCard;
    }

    public int getRam(){
        return ram;
    }
}
