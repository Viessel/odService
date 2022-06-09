package com.dh.integradora23.service;

import com.dh.integradora23.dao.OdontologoDao;
import com.dh.integradora23.model.Odontologo;

import java.util.List;

public class OdontologoService {
    OdontologoDao odDao = new OdontologoDao();
    public Odontologo getById() {
        return odDao.getById();
    }
    public List<Odontologo> getAll(){
        return odDao.getAll();
    }
}
