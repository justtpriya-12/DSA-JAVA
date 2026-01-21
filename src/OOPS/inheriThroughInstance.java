package OOPS;
class Animal{
    String Animal;
    void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
}
public class inheriThroughInstance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
//creat a class emplo. with private variables id and salary insure that id should always be positive salary should not be less than 10000 use setter method validate before assigning value
