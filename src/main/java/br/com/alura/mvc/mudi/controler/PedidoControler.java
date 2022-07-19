package br.com.alura.mvc.mudi.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoControler {

    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }
}
