package com.zoo.animal;

import com.zoo.animal_interfaces.Say;
import com.zoo.animal_interfaces.Moove;
import com.zoo.animal_interfaces.Sleep;

public abstract class Animal implements Say, Moove, Sleep {

    public String name;

    Animal(){
        this.name="неизвестное животное";
    }

    Animal(String name) {
    this.name=name;
    }
    Animal(int name) {
        this.name=Integer.toString(name);
    }

    public abstract void setName(String name);
    public abstract void setName(int name);
    public abstract String getName();
    public abstract void eat();




}
