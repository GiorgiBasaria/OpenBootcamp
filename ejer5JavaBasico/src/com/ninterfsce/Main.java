package com.ninterfsce;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUD();

        Coche kia = new Coche("Kis Xceed", 250, 280.0, true);
        Coche toyota = new Coche("Toyots Supra", 550, 350, false);
        Coche seat = new Coche("Sest Leon", 180, 200, false);

        //guardar los coches
        cocheCRUD.save(kia);
        cocheCRUD.save(toyota);
        cocheCRUD.save(seat);

        // cosulta
        List<Coche> coches = cocheCRUD.findAll();
        System.out.println(coches);

    }
}
