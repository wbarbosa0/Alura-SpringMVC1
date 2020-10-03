package br.nom.warbosa.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.nom.warbosa.mvc.mudi.model.entity.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {

		Pedido p = new Pedido();
		p.setNomeProduto("Suporte de Monitor");
		p.setDataEntrega(LocalDate.now());
		p.setDescricao("Souza & Cia, 3349, Black Piano com Branco");
		p.setUrlImagemProduto("https://images-na.ssl-images-amazon.com/images/I/61cfIQUyybL._AC_SL1500_.jpg");
		p.setUrlProduto(
				"https://www.amazon.com.br/gp/product/B07D9SMPXJ?pf_rd_r=YHJM417RBRCDAWST4E8Y&pf_rd_p=72a7651a-a7d8-4551-b248-c61480b6ce6e");
		p.setValorNegociado(new BigDecimal("71.50"));

		List<Pedido> pedidos = Arrays.asList(p);
		model.addAttribute("pedidos", pedidos);

		return "home";
	}
}
