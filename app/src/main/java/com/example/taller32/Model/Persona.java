package com.example.taller32.Model;

import java.io.Serializable;

public class Persona implements Serializable {

    //Attributes
   private String nombre,apellido, teléfono, correo;

   //Constructor
    public Persona(String nombre, String apellido, String teléfono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.teléfono = teléfono;
        this.correo = correo;
    }

    // Getters & Setters
    public Persona() {
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

    public String getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

