package com.Week4Sql_Java_Html.Week4Sql_Java_Html.Controller;
import com.Week4Sql_Java_Html.Week4Sql_Java_Html.dao.ClienteDao;
import com.Week4Sql_Java_Html.Week4Sql_Java_Html.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ClienteController {
  
    @Autowired
    private ClienteDao clienteDao;
    @GetMapping("/")
    public String inicio(Model model) {
        
        Cliente cliente1 = new Cliente("Johan","Matarrita","jmatarrita80217@gmail.com","85701750");
        Cliente cliente2 = new Cliente("Aaron","Ruiz","aarongeruizme@gmail.com","84297869");
        Cliente cliente3 = new Cliente("Rebeca","Arguedas","RebecaArg@gmail.com","85454232");
        
        
        return "index";
    }
    
}
