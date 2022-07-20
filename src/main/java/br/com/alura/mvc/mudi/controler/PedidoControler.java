package br.com.alura.mvc.mudi.controler;

import br.com.alura.mvc.mudi.dto.RequisicaoNovoPedido;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoControler {
    @Autowired
    private PedidoRepository pedidoRepositoty;
    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }
    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicao){
        Pedido pedido = requisicao.toPedido();
        pedidoRepositoty.save(pedido);
        return "pedido/formulario";
    }
}
