package com.company;

class Main {




    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();
        Animal a4 = new Poodle();

        a1.setName("Snoopy");
        a1.move();
        a2.move();
        if(a1 instanceof  Dog) {
            Dog d1 = (Dog) a1;
            d1.bark();
        }

        Cat c1 = (Cat)a2;
        c1.miaoo();
        //Dog d = new Animal();
        Dog d2 = new Dog();
        Animal a5 = d2;


    }



}

class Animal{
    private String name;

    public void move(){
        System.out.println("moving..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("waf waf.. my name is " + getName());
    }

    @Override
    public void move() {
        System.out.println("dog is moving...");
    }
}

class Cat extends Animal{
    public void miaoo(){
        System.out.println("miaooo.. my name is " + getName());
    }

}
class Poodle extends Dog{

}
