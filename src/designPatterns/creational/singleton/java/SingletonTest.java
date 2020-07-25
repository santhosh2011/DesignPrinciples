package designPatterns.creational.singleton.java;

import java.time.Duration;
import java.time.LocalDateTime;

public class SingletonTest {

    static class ThreadSample implements Runnable {
        private String name;

        public ThreadSample(String s) {
            this.name = s;
        }

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(this.name);
            System.out.println(singleton);
        }
    }


    static class ThreadSafeSample implements Runnable {
        private String name;

        public ThreadSafeSample(String s) {
            this.name = s;
        }

        @Override
        public void run() {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance(this.name);
            System.out.println(singleton);
        }
    }

    public static void main(String[] args) {
        //
//    LocalDateTime before = LocalDateTime.now();
//    Singleton s = Singleton.getInstance();
//    LocalDateTime after = LocalDateTime.now();
//    System.out.println(s + ": time taken for creation - " + Duration.between(before, after));
//    before = LocalDateTime.now();
//    Singleton s_new = Singleton.getInstance();
//    after = LocalDateTime.now();
//    System.out.println(s_new + ": time taken for creation - " + Duration.between(before, after));
//    System.out.println("Is s_new equals s : "+ (s_new==s));


        // TreadTest
//    Thread t1 = new Thread(new ThreadSample("Test"));
//    Thread t2 = new Thread(new ThreadSample("Name"));
//
//    t1.start();
//    t2.start();
    /*
     If output is
      The object is  Test
      The object is  Name

      then its not thread safe it ended up creating two objects

     */

        Thread t1 = new Thread(new ThreadSafeSample("Test"));
        Thread t2 = new Thread(new ThreadSafeSample("Name"));

        t1.start();
        t2.start();
    }
}
