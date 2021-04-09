package com.zoo.animal;

public class Monkey extends Animal {

    public Monkey(){
        super("неизвестная обезьяна");
    }

    public Monkey(String name) {
        super(name);
    }
    public Monkey(int name){super(name);}
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
        System.out.println("я ем все что угодно");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я лезу на дерево");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я кричу");
    }
}
