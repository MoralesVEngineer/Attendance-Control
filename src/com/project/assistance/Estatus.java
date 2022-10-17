/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.assistance;

/**
 *
 * 
 */
public class Estatus {
    
    private int idEstatus;
    private String Descripcion;

    public Estatus() {
    }

    public Estatus(int idEstatus, String Descripcion) {
        this.idEstatus = idEstatus;
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return Descripcion;
    }

    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
}
