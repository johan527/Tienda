package com.tienda_l.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="empleado")
public class Empleado implements Serializable {
   
    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Long idEmpleado;
    private String nombre;
    private String contrasena;
    private String rol;
   

    public Empleado() {
    }
       
    public Empleado(Long idEmpleado, String nombre,String contrasena,String rol) {
        this.idEmpleado=idEmpleado;
        this.nombre=nombre;
        this.contrasena=contrasena;
        this.rol=rol;
                
    }
    

   
}
