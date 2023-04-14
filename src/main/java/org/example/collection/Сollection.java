package org.example.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Сollection {


    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    public static void lists() {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int Number = 1000000;
        final int Number1 = 1000;
        for (int i = 0; i < Number; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < Number1; i++) {
            arrayList.get((int) (Math.random() * (Number - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < Number1; i++) {
            linkedList.get((int) (Math.random() * (Number - 1)));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

