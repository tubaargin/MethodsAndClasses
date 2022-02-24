package com.tubaargin.methodsandclasses;

public class Musicians {
    //attribute
    String name;
    String instrument;
    int age;


    //Constructor bir instance oluştuğunda çağrılacak ilk metot
    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
        System.out.println("constructor called");
    }
}
