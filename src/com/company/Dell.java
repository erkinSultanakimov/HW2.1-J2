package com.company;

public class Dell extends Computers implements Printable{
    private String color;
    private String targetMarket;

    public Dell(String name, String videoCard, int ram, String color, String targetMarket){
        super(name,videoCard,ram);
        this.color = color;
        this.targetMarket = targetMarket;
    }

    public String getColor(){
        return color;
    }

    public String getTargetMarket(){
        return targetMarket;
    }

    public void print(){
        System.out.println("Имя: " + getName() + " Видеокарта: " + getVideoCard() + " Оперативная память: " +
                getRam() +  " Цвет: " + getColor() + " Для рынка: " + getTargetMarket());
    }
}
