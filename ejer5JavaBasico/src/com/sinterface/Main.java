package com.sinterface;

import com.ninterfsce.Coche;

public class Main {
    static CocheCRUD cocheCRUD;

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.findAll();
        cocheCRUD.save();
        cocheCRUD.delete();

    }
}
