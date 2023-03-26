/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_l.service;

import com.tienda_l.domain.Empleado;
import java.util.List;

/**
 *
 * @author Laboratorios
 */
public interface EmpleadoService {
    
    public List<Empleado> getEmpleados();
    
    public Empleado getEmpleado(Empleado empleado);
    
    public void save(Empleado empleado);
    
    public void delete(Empleado empleado);
    
}
