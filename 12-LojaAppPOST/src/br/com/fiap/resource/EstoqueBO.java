package br.com.fiap.resource;

import java.util.ArrayList;
import java.util.List;

public class EstoqueBO {
	private static EstoqueBO estoqueBo;
	private ArrayList<ProdutoTO> lista = null;

	public static EstoqueBO getInstance() {
		if (estoqueBo == null) {
			estoqueBo = new EstoqueBO();
		}
		
		return estoqueBo;
	}

	public EstoqueBO() {
		lista = new ArrayList<ProdutoTO>();
		lista.add(EstoqueBO.consultarProduto(401));
		lista.add(EstoqueBO.consultarProduto(402));
		lista.add(EstoqueBO.consultarProduto(403));
		System.out.println("Construiu!");
	}

	public static ProdutoTO consultarProduto(int codigo) {
		if (codigo == 401) {
			return new ProdutoTO(codigo, "Camiseta branca", 4, 2.99);
		} else if (codigo == 402) {
			return new ProdutoTO(codigo, "Camiseta azul", 4, 2.99);
		} else if (codigo == 403) {
			return new ProdutoTO(codigo, "Camiseta rosa", 4, 2.99);
		} else {
			return new ProdutoTO(-1, "Produto não encontrado", 0, 0);
		}
	}

	public List<ProdutoTO> listar() {
		return lista;
	}

	public void cadastrar(ProdutoTO produto) {
		lista.add(produto);
		System.out.println("Gravou!");
	}
	public void remover (int codigo) {
		for(ProdutoTO produto : lista) {
			if(produto.getCodigo() == codigo) {
			lista.remove(produto);
			System.out.println("Deletado!");
			}
		}
	}

	public void atualizar (ProdutoTO produto) {
		for(ProdutoTO produto2 : lista) {
			if(produto.getCodigo() == produto2.getCodigo()) {
			produto2.setDescricao(produto.getDescricao());
			produto2.setPreco(produto.getPreco());
			produto2.setQuantidade(produto.getQuantidade());
			break;
			}
		}
	}
}
