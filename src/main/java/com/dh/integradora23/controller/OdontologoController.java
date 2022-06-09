package com.dh.integradora23.controller;

import com.dh.integradora23.model.Odontologo;
import com.dh.integradora23.service.OdontologoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OdontologoController {
    public OdontologoService odService = new OdontologoService();
    @GetMapping("/odontologos")
    public List<Odontologo> getAllOD(){
        return odService.getAll();
    }
    @GetMapping("/odontologobyid")
    public String getById(@RequestParam String id){
        return "<h1>" + odService.getById().toString() + "</h1>";
    }}
