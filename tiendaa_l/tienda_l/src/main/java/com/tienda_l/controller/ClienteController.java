package com.tienda_l.controller;

import com.tienda_l.domain.Cliente;
import com.tienda_l.dao.ClienteDao;
import com.tienda_l.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@Controller
@Slf4j
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var variable="Hola desde el Back-End";
        model.addAttribute("mensaje", variable);
       
        
        
        var clientes=clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "index";
    }
    
    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente){
        
        return "modificarCliente";
               
    }
    @PostMapping("/guardarCliente")
    public String guardarCliente (Cliente cliente){
        clienteService.save(cliente);
        return "redirect:/";
    }
    @GetMapping("/modificarCliente/{idCliente}")
    public String modificarCliente (Cliente cliente, Model model){
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente",cliente);
        return "modificarCliente";
        
    }
    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente (Cliente cliente){
        clienteService.delete(cliente);
        
        return "redirect:/";
        
    }
}
