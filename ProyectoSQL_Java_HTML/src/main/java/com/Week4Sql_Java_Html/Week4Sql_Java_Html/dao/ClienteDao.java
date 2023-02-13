package com.Week4Sql_Java_Html.Week4Sql_Java_Html.dao;

import com.Week4Sql_Java_Html.Week4Sql_Java_Html.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente,Long> {
    
}
