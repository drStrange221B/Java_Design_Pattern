package com.company.emrys.designpattern.creation.bulider;

public class BuilderDemo {

    public static void main(String[] args){
        BuilderClass.Builder builder =  new BuilderClass.Builder();

        builder.bread("Wheat")
                .condiments("Tomato")
                .dressing("Olive oil")
                .meat("Chicken");

        BuilderClass builderClass = builder.build();

        System.out.println(builderClass);


    }




}
