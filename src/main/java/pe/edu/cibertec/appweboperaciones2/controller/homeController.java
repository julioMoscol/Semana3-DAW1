package pe.edu.cibertec.appweboperaciones2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }
}
