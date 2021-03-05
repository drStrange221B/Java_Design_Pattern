package com.company.emrys.designpattern.creation.singleton;

/**
 * this class will have basic rule of Singleton
 * 1) private constructor
 * 2) private static field instance of the Singleton
 *
 * goal is to create one instance
 *
 * Drawback as to this will have performance issue. Mean with this design pattern
 * the application will load slow and the class itself is not thread safe
 */
public class BasicEagerLoadSingleton {

    private static BasicEagerLoadSingleton singletonBasic = new BasicEagerLoadSingleton();

    private BasicEagerLoadSingleton(){}

    public static BasicEagerLoadSingleton getInstance(){
        return singletonBasic;
    }

}
