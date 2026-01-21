package OOPS;

import java.util.*;
class Car {
    String brand;
    int year;
    void display(){
        System.out.println("brand: "+brand);
        System.out.println("year: "+year);
    }
}
public class instanceClas {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand ="tata";
        c1.year=2022;
        c1.display();
    }
}
