package br.nom.warbosa.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.nom.warbosa.mvc.mudi.dto.NovoPedidoDto;
import br.nom.warbosa.mvc.mudi.model.entity.Pedido;
import br.nom.warbosa.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("pedido/formulario");

		return mv;
	}

	@PostMapping("novo")
	public ModelAndView home(NovoPedidoDto pedidoDto) {
		ModelAndView mv = new ModelAndView("pedido/formulario");

		Pedido pedido = pedidoDto.toPedido();
		pedidoRepository.save(pedido);
		return mv;
	}

}
