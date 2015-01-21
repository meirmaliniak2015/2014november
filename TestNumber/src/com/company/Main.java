package com.company;

class Main {




    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();
        Animal a4 = new Poodle();


        //Dog d = new Animal();


    }



}

class Animal{
    public void move(){
        System.out.println("moving..");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("waf waf..");
    }
}

class Cat extends Animal{

}
class Poodle extends Dog{

}
