package com.zoo.animal;

public class Turtle extends Animal {

    public Turtle(){
        super("неизвестная черепаха");
    }

    public Turtle(String name) {
        super(name);
    }
    public Turtle(int name){super(name);}
    @Override //общий метод
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void setName(int name){ this.name=Integer.toString(name);}
    @Override //общий метод
    public String getName() {
        return this.name;
    }

    @Override //различный для всех метод
    public void eat() {
        System.out.println("я ем растения");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я ползу");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я молчу");
    }
}
