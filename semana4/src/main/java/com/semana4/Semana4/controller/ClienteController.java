package com.tienda_l.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ClienteController {
  
    @GetMapping("/")
    public String inicio(Model model) {
        var variable="Hola desde el Back-End";
        model.addAttribute("mensaje", variable);
        return "index";
    }
    
}
