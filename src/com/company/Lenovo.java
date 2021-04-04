package com.company;

public class Lenovo extends Computers implements Printable{
    private String videoCardType;
    private int value;

    public Lenovo(String name, String videoCard, String videoCardType, int value, int ram){
        super(name,videoCard,ram);
        this.videoCardType = videoCardType;
        this.value = value;
    }

    public String getVideoCardType(){
        return videoCardType;
    }

    public int getValue(){
        return value;
    }

    public void print(){
        System.out.println("Имя: " + getName() + " Видеокарта: " + getVideoCard() + " Оперативная память: " +
                getRam() +  " Модель видеокарты: " + getVideoCardType() + " Количество: " + getValue());
    }
}
