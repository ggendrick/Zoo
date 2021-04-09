package com.zoo.animal;

public class Sparrow extends Animal {

    public Sparrow(){
        super("неизвестный воробей");
    }

    public Sparrow(String name) {
        super(name);
    }
    public Sparrow(int name){super(name);}
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
        System.out.println("я ем семена");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я лечу");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я чирикаю");
    }
}
