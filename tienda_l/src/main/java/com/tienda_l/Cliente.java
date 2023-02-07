
package com.semana4.Semana4.controller;

/**
 *
 * @author johan
 */

public class Cliente {
    
    String nombre="";
    String apellido="";
    String correo="";
    String telefono="";
    
    public Cliente(String nombre,String apellido,String telefono,String correo){
        this.nombre=nombre;
        this.correo=correo;
        this.telefono=telefono;
        this.apellido=apellido;
    }
}
