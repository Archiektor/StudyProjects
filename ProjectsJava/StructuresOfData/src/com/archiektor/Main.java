package com.archiektor;


public class Main {

    public static void main(String[] args) {

        System.out.println("Main Thread started");

        /** NewThread2 newThread2 = new NewThread2("raw");

         try {
         for (int i = 0; i < 5; i++) {
         System.out.println("Main Thread " + i);
         Thread.sleep(1000);
         }
         } catch (InterruptedException e) {
         e.printStackTrace();
         }
         System.out.println("Main Thread ended");*/

        NewThread one = new NewThread("One");
        NewThread two = new NewThread("Two");
        NewThread three = new NewThread("Three");

        try {
            one.t.join();
            two.t.join();
            three.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread ended");
    }

}


        /*GenericsType<Double> g1 = new GenericsType<>();
        g1.set(132.45);

        GenericsType<Integer> g2 = new GenericsType<>();
        g2.set(4234);

        List<Number> list = new ArrayList<>();
        list.add(g1.get());
        list.add(g2.get());

        GenericsMethods.printData(list);


        //above statement can be written simply as
        //isEqual = GenericsMethods.isEqual(g1, g2);

       /* List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        printList(list);*/


//List<String> strList = new ArrayList<>();
//strList.add("10");
//strList.add("100");
//printList(strList);*/


/**
 * List<Number> intList = new ArrayList<Number>();
 * intList.add(1);
 * intList.add(2.3);
 * intList.add(3.5);
 * intList.add(4);
 * System.out.println("Список до обработки дженерик-методом: " + intList);
 * Main.fill(intList, 0);
 * System.out.println("Список после обработки дженерик-методом: "
 * + intList);
 */



