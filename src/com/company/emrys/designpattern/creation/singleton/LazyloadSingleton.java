package com.company.emrys.designpattern.creation.singleton;

public class LazyloadSingleton {

    private static LazyloadSingleton singletonLazyload = null;

    private LazyloadSingleton(){}

    public static LazyloadSingleton getInstance(){

        if(singletonLazyload == null){

            singletonLazyload = new LazyloadSingleton();

        }

        return singletonLazyload;
    }
}
