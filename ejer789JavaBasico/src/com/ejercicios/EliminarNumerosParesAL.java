package com.ejercicios;

import java.util.ArrayList;

public class EliminarNumerosParesAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
                // Al eliminar un elemento, los índices posteriores se desplazan
            }
        }
        for(int i: list){
            System.out.println(i);
            // Imprime los números impares del 1 al 10
        }

    }
}
