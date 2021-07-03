package com.example.miformulario;

public class Contacto {
    private String telefono;
    private String nombre;
    private String email;
    private String descripcion;

    public Contacto(String telefono, String nombre, String email, String descripcion) {
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;
        this.descripcion = descripcion;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
