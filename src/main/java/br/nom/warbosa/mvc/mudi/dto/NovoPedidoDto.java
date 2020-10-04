package br.nom.warbosa.mvc.mudi.dto;

import br.nom.warbosa.mvc.mudi.model.entity.Pedido;

public class NovoPedidoDto {
	private String nomeProduto;
	private String urlProduto;
	private String urlImagemProduto;
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagemProduto() {
		return urlImagemProduto;
	}

	public void setUrlImagemProduto(String urlImagemProduto) {
		this.urlImagemProduto = urlImagemProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		Pedido pedido = new Pedido();

		pedido.setDescricao(descricao);
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlImagemProduto(urlImagemProduto);
		pedido.setUrlProduto(urlProduto);

		return pedido;
	}
}
