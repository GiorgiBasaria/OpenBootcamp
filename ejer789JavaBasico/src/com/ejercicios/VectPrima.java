package com.ejercicios;

import java.util.SortedMap;
import java.util.Vector;

public class VectPrima {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.remove(1);
        vector.remove(2);
        System.out.println(vector.toString());


    }
}
