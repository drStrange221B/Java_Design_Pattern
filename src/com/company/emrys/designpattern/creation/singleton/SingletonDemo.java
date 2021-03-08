package com.company.emrys.designpattern.creation.singleton;

public class SingletonDemo {

    public static void main(String[] args)
    {
//        testing Basic_EagerLoad_Singleton
//        below code will throw an exception as the consturctor is private, it cannot instante class.
//        BasicEagerLoadSingleton singletonBasicEagerLoad = new BasicEagerLoadSingleton();

        BasicEagerLoadSingleton instance = BasicEagerLoadSingleton.getInstance();
        BasicEagerLoadSingleton instance1 = BasicEagerLoadSingleton.getInstance();

        if(instance == instance1) {
            System.out.println("Only one instance of BasicEagerLoadSingleton class was created !");
        }

        // checking lazy loading of Singleton

        LazyloadSingleton singletonLazyload = LazyloadSingleton.getInstance();
        LazyloadSingleton singletonLazyload2 = LazyloadSingleton.getInstance();

        if(singletonLazyload == singletonLazyload2)
        {
            System.out.println("Only one instance of LazyloadSingleton class was created !");

        }

        // Checking lazy and synchronized singleton


        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();

        if(synchronizedSingleton == synchronizedSingleton1){
            System.out.println("Only one instance of SynchronizedSingleton class was created !");
        }

    }



}
