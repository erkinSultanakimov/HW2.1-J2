package com.company;

public class Hp extends Computers implements Printable {
    private int diagonal;
    private String[] options;

    public Hp(String name, String videoCard, int ram, int diagonal, String[] options){
        super(name,videoCard,ram);
        this.diagonal = diagonal;
        this.options = options;
    }

    public int getDiagonal(){
        return diagonal;
    }

    public String[] getOptions(){
        return options;
    }

    public void print(){
        System.out.println("Имя: " + getName() + " Видеокарта: " + getVideoCard() + " Оперативная память: " +
                getRam() +  " Диагональ: " + getDiagonal() + " Опции: " + getOptions()[0] + getOptions()[1] + getOptions()[2]);
    }
}
