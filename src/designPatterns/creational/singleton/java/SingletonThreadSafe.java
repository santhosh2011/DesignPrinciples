package designPatterns.creational.singleton.java;

import java.util.concurrent.TimeUnit;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private String s;

    private SingletonThreadSafe(String s) {
        // This is time heavy constructor.
        try {
            this.s = s;
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            System.out.println("Exception occoured :" + e.toString());
        }
    }

    public static SingletonThreadSafe getInstance(String s) {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe(s);
                }
            }
        }
        return instance;
    }

    public String toString() {
        return "The object is  " + this.s;
    }
}
