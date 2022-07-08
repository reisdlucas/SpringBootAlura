package br.com.alura.mvc.mudi.controler;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Iphone 11");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/71kZfQA-Y7L._AC_SL1500_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Iphone-Apple-Branco-64gb-Desbloqueado/dp/B08N1MG4VL/ref=sr_1_2?keywords=ihpone11&qid=1657213640&sprefix=ihp%2Caps%2C394&sr=8-2&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Uma descrição para esse pedido");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

    return "home";
    }
}
