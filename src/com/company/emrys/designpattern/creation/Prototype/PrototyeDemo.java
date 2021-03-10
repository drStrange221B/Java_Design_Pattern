package com.company.emrys.designpattern.creation.Prototype;

public class PrototyeDemo {

    public static void main(String[] args){

        Registry registry = new Registry();
        Item movie1= registry.createItem("Movie");
        Item movie2= registry.createItem("Movie");
        System.out.println("Movie1 " + movie1);
        System.out.println("Movie2 " + movie2);
        movie1.setTitle("new movie1");
        System.out.println("Movie1.change name to new movie1 :" +movie1.getTitle());

        System.out.println("Movie2 " + movie2);
        movie2.setTitle("new movie2");
        System.out.println("Movie1.change name to new movie2 :" +movie2.getTitle());
    }

}
