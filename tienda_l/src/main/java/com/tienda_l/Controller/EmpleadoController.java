package com.tienda_l.controller;

import com.tienda_l.domain.Empleado;
import com.tienda_l.dao.EmpleadoDao;
import com.tienda_l.service.EmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/listado")
    public String inicio(Model model) { 
        var empleados=empleadoService.getEmpleados();
        model.addAttribute("empleados", empleados);
        model.addAttribute("totalEmpleados",empleados.size());
        
        return "/empleado/listado";
    }
    
     @GetMapping("/nuevo")
    public String empleadoNuevo(Empleado empleado) { 
        return "/empleado/modifica";
    }
    
     @PostMapping("/guardar")
    public String empleadoGuardar(Empleado empleado) { 
        empleadoService.save(empleado);
        return "redirect:/empleado/listado";
    }
    
    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado) { 
        empleadoService.delete(empleado);
        return "redirect:/empleado/listado";
    }
    
    
    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(Empleado empleado,Model model ) { 
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/empleado/modifica";
    }
    
    
    
    
}
