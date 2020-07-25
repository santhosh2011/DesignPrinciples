package designPatterns.creational.singleton.java;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;

public class Singleton {
    private static Singleton instance;
    private String s;

    private Singleton(String s) {
        // This is time heavy constructor.
        try {
            this.s = s;
            TimeUnit.SECONDS.sleep(10);
        } catch (Exception e) {
            System.out.println("Exception occoured :" + e.toString());
        }
    }

    public static Singleton getInstance(String s) {
        if (instance == null) {
            instance = new Singleton(s);
        }
        return instance;
    }

    public String toString() {
        return "The object is  " + this.s;
    }
}
