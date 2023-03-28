/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_l.service;

import com.tienda_l.dao.UsuarioDao;
import com.tienda_l.domain.Rol;
import com.tienda_l.domain.Usuario;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Laboratorios
 */
@Service("userDetailsService")
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username)throws UsernameNotFoundException  {
        //Se busca el usuario
        Usuario usuario=usuarioDao.findByUsername(username);
        
        //Verifico que el usuario exista
        
        if (usuario==null){
            throw new UsernameNotFoundException (username);
        }
        //Si esto no lo rechaza Y ESTOY UBICADO EN ESTA LINEA
        var roles=new ArrayList<GrantedAuthority>();
        for (Rol rol:usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(),
                usuario.getPassword(),
                roles);
    }
    
}
