package com.zoo.animal;

public class Bear extends Animal {

    public Bear(){
        super("неизвестный медведь");
    }

    public Bear(String name) {
        super(name);
    }
    public Bear(int name){super(name);}
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
        System.out.println("я ем мясо");
    }


    @Override //различный для всех метод
    public void moove(){
        System.out.println("я иду");

    }

    @Override //различный для всех  метод
    public void say() {
        System.out.println("я рычу");
    }
}
