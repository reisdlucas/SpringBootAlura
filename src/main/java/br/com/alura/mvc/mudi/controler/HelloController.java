package br.com.alura.mvc.mudi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String Hello (Model model) {
        model.addAttribute("nome","");
        return "hello";
    }
}
