/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Week4Sql_Java_Html.Week4Sql_Java_Html.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author johan
 */
@Data
@Entity
@Table(name="cliente")

public class Cliente implements Serializable {
    private static final long serialVersionUID =1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idcliente;
    public String nombre;
    public String apellido;
    public String correo;
    public String telefono;
    


public Cliente(String nombre,String apellido,String correo,String telefono){
    this.telefono=telefono;
    this.correo=correo;
    this.apellido=apellido;
    this.nombre=nombre;
           
    
    }
          
}
