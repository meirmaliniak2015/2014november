package com.company;

class Main {




    public static void main(String[] args) {

        /*
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();
        Animal a4 = new Poodle();
        //Poodle a5 = new Animal(); //error!
        //a1.bark(); error although a1 points on a Dog.
        a1.setName("Snoopy");
        a1.move(); //this will invoke the method written in Dog (because it is overridden)
        a2.move(); //this will invoke the method written in Animal
        //if(a1 instanceof Dog) {
            Dog d1 = (Dog) a1; //downcasting
            d1.bark();
        //}

        Cat c1 = (Cat)a2;
        c1.miaoo();
        //Dog d = new Animal();
        Dog d2 = new Dog();
        Animal a5 = d2; //upcasting
        */

        Number[] nums = new Number[5];
        nums[0] = new Byte((byte)10);
        nums[1] = new Integer(10);
        nums[2] = new Float(10.0f);
        nums[3] = new Double(10.0f);
        nums[4] = new Complex(10,10);
        System.out.println("The sum of nums is: " + TestNumber.sum(nums));


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
