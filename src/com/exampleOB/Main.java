package com.exampleOB;

public class Main {
    public static void main(String[] args) {

        //polimorfismo
        //cree una instancia llamada iphone
        SmartDevice QualcommToq = new SmartWatch("iOS", 1.55, 5.0, "2 GB", "32 GB", false, true);
        System.out.println(QualcommToq);
        //Sobreescribo valor del atributo memoriaRam de la instancia QualcommToq
        QualcommToq.capacidadDeAlmacenamiento = "64 GB";
        System.out.println(QualcommToq);

        // creo una una instancia de tipo SmartPhone.
        SmartPhone iphone11 = new SmartPhone("iOS", 5.8, 23.0, "6 GB", "256GB", true, true);
        System.out.println(iphone11);
        iphone11.capacidadDeAlmacenamiento = "128 GB";
        System.out.println(iphone11);
    }
}
