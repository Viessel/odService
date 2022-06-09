package com.dh.integradora23.dao;

import com.dh.integradora23.model.Odontologo;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDao {
    Odontologo od1 = new Odontologo(1, "odon", "tologo", "123");
    Odontologo od2 = new Odontologo(2,  "otro odon", "tologo", "123");
    List<Odontologo> allOd = new ArrayList<>();

    public Odontologo getById() {
        return od1;
    }
    public List<Odontologo> getAll() {
        allOd.add(od1);
        allOd.add(od2);
        return allOd;
    }
}
