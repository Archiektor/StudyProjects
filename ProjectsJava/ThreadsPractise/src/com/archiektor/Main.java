package com.archiektor;

import testobject.Computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        System.out.println(computer.ram);
//        System.out.println(computer.hdd);


    }
}


//        Man man1 = new Man(31, "BLR");
//        Man man2 = new Man(31, "BLR");
//        Man man3 = new Man(23, "RUS");
//        Man man4 = man3;
//        String a1 = "name";
//        String a2 = "name";
//
////        System.out.println(man1.hashCode());
////        System.out.println(man2.hashCode());
////        System.out.println(man1.equals(man2));
////        System.out.println("///////////////////////");
////        System.out.println(man3.hashCode());
////        System.out.println(man4.hashCode());
////        System.out.println(man3.equals(man4));
//        System.out.println("///////////////////////");
//        System.out.println(man1.hashCode());
//        System.out.println(man3.hashCode());
//        System.out.println(man1.equals(man3));

/**
 * Object object = new Object();
 * // write your code here
 * <p>
 * egg = new EggVoice();
 * <p>
 * Thread thread = new Thread(egg);
 * thread.setDaemon(true);
 * thread.start();
 * <p>
 * ChickhenVoice chickhenVoice = new ChickhenVoice();
 * chickhenVoice.start();
 * <p>
 * System.out.println("Spor begin !");
 * <p>
 * if (chickhenVoice.isAlive()) {
 * try {
 * chickhenVoice.join();
 * } catch (InterruptedException e) {
 * e.printStackTrace();
 * }
 * System.out.println("Первым появилось яйцо!");
 * } else {
 * System.out.println("Первой появилась курица!");
 * }
 * <p>
 * System.out.println("Spor ended");
 */
