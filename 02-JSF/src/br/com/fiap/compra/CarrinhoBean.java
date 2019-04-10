package br.com.fiap.compra;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {

	private List<String> selecionados;
	private List<String> quantidade;
	private boolean formaPagamento;
	
	public void comprar() {
		
	}
	

	public List<Produto> getProdutos() {
		List<Produto> produtos = new ArrayList();
		produtos.add(new Produto("Camiseta","Camiseta Azul gola V", 13.52));
		produtos.add(new Produto("Calça","Calça Jeans", 89.99));
		produtos.add(new Produto("Shorts","Mini Shorts", 20.50));
		produtos.add(new Produto("Toca","Toca de lã preta", 15.99));
		produtos.add(new Produto("Luva","Luva de lã verde", 19.00));
		return produtos;
		
	}
	
	public CarrinhoBean() {
		super();
	}

	
	public CarrinhoBean(List<String> selecionados, List<String> quantidade, boolean formaPagamento) {
		super();
		this.selecionados = selecionados;
		this.quantidade = quantidade;
		this.formaPagamento = formaPagamento;
	}


	public List<String> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(List<String> quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(boolean formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public List<String> getSelecionados() {
		return selecionados;
	}


	public void setSelecionados(List<String> selecionados) {
		this.selecionados = selecionados;
	}
	
	
	
}
