package br.com.fiap.compra;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CarrinhoBean {

	private List<String> listaProdutos;
	private String selectQtd;
	private String formaPagamento;
	
	

	public void comprar() {
		for(String valor : listaProdutos) {
			System.out.println(valor);
		}
		
		System.out.println(selectQtd);
		
		System.out.println(formaPagamento);
		
	}
	

	public List<Produto> getProdutos() {
		List<Produto> produtos = new ArrayList<Produto>();
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

	
	public CarrinhoBean(List<String> listaProdutos, String formaPagamento, String selectQtd) {
		super();
		this.listaProdutos = listaProdutos;
		this.formaPagamento = formaPagamento;
		this.selectQtd = selectQtd;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public List<String> getListaProdutos() {
		return listaProdutos;
	}


	public void setListaProdutos(List<String> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public String getListaSelects() {
		return selectQtd;
	}


	public void setListaSelects(String selectQtd) {
		this.selectQtd = selectQtd;
	}
	
}
