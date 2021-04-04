package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Hp");
        createObject("Lenovo");
        createObject("Dell");

    }

    public static Computers createObject(String className) {
        switch (className) {
            case "Dell":
                Dell dell = new Dell("Dell Latitude 3480", "Intell", 8, "black", "US");
                dell.print();
                return dell;
            case "Lenovo":
                Lenovo lenovo = new Lenovo("Lenovo IdeaPad", "Intell", "Celleron", 1, 4);
                lenovo.print();
                return lenovo;
            case "Hp":
                Hp hp = new Hp("Hp","Nvidia",4,15,new String[]{"Lan", "Bluetooth", "WiFi"});
                hp.print();
                return hp;
                default:
                    return null;

        }

    }
}
