/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_l.service.impl;

import com.tienda_l.dao.EmpleadoDao;
import com.tienda_l.domain.Empleado;
import com.tienda_l.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laboratorios
 */

@Service
public class EmpleadoServiceImpl implements EmpleadoService  {
    
    @Autowired
    private EmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Empleado> getEmpleados() {
        var lista =(List<Empleado>)empleadoDao.findAll();
        
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Empleado getEmpleado(Empleado empleado) {
        return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Empleado empleado) {
        
         empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void delete(Empleado empleado) {
        empleadoDao.delete(empleado);
    }
    
}
