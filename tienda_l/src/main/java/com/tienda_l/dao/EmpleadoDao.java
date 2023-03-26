package com.tienda_l.dao;

import com.tienda_l.domain.Empleado;
import com.tienda_l.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDao extends CrudRepository<Empleado, Long> {
    
}
