package com.ejercicios;

import java.io.*;

public class FileINfileOut {
    public static void main(String[] args) throws IOException {
        try {
            copyFile("archivo1.txt", "archivo2.txt");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }

    public static void copyFile(String fileIn, String fileOut) throws IOException {
        FileInputStream fis = new FileInputStream(fileIn);
        PrintStream ps = new PrintStream(new FileOutputStream(fileOut));
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            ps.write(buffer, 0, length);
        }
        ps.close();
        fis.close();
        System.out.println("El archivo se ha copiado exitosamente.");
    }
}
