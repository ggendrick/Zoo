package com.zoo.animal;

public class Shark extends Animal {

    public Shark(){
        super("неизвестная акула");
    }

    public Shark(String name) {
        super(name);
    }
    public Shark(int name){super(name);}
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
        System.out.println("я ем других рыб");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я плыву");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я молчу");
    }
}
