package com.dh.integradora23.model;

public class Odontologo {

    private int id;
    private String nombre;
    private String apellido;
    private String numMatricula;


    public Odontologo(String nombre, String apellido, String numMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMatricula = numMatricula;
    }
    public Odontologo(int id) {
        this.id = id;
    }

    public Odontologo(int id, String nombre, String apellido, String numMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMatricula = numMatricula;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numMatricula='" + numMatricula + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

}
