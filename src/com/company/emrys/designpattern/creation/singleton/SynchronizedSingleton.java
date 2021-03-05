package com.company.emrys.designpattern.creation.singleton;

public class SynchronizedSingleton {

    private static volatile SynchronizedSingleton synchronizedSingleton = null;

    private SynchronizedSingleton(){
        if(synchronizedSingleton !=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static SynchronizedSingleton getInstance()
    {
        if(synchronizedSingleton == null){

            synchronized(SynchronizedSingleton.class){
                if(synchronizedSingleton == null){
                    synchronizedSingleton = new SynchronizedSingleton();
                }
            }
        }
        return synchronizedSingleton;
    }

}
