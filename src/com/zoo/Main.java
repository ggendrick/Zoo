package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.animal.Bear;

public class Main {

    public static void main(String[] args) {

       Animal bear1 = new Bear();
       Bear bear2 = new Bear();
        System.out.println(bear1.getName());
        System.out.println(bear2.getName()); //конструктор по умолчанию никогда не вызовется
        bear1.say();
        bear1.eat();
        bear1.setName("Мишаня");
        System.out.println("Имя животного: "+bear1.getName());
    }
}
