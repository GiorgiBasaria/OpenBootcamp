package com.ejercicios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream output = System.out;
        InputStream input = System.in;


        HashMap<Integer, String> attempts = new HashMap<>();


        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        output.println("Bienvenido al juego de adivinanza de números!");
        output.println("Estoy pensando en un número entre 1 y 100.");
        output.println("Trata de adivinarlo!");

        int guess;
        int attemptsCount = 0;

        while (true) {
            output.print("Intenta adivinar el número: ");

            try {
                guess = Integer.parseInt(new BufferedReader(new InputStreamReader(input)).readLine());
                attemptsCount++;

                if (guess == numberToGuess) {
                    output.println("¡Felicitaciones! Adivinaste el número en " + attemptsCount + " intentos.");
                    break;
                } else if (guess < numberToGuess) {
                    output.println("El número que buscas es mayor que " + guess);
                } else {
                    output.println("El número que buscas es menor que " + guess);
                }


                attempts.put(attemptsCount, String.valueOf(guess));

            } catch (IOException e) {
                output.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                output.println("Error: Debe ingresar un número entero.");
            }
        }


        output.println("Tus intentos anteriores:");

        for (Map.Entry<Integer, String> entry : attempts.entrySet()) {
            output.println("Intento #" + entry.getKey() + ": " + entry.getValue());
        }
    }
}

