package br.com.fiap.compra;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroBean {
	private String raca;
	private String nome;
	private String genero;
	private int idade;
	private double peso;
	private String porteResp;
	private String rg;
	
	
	public void cadastrar() {
		System.out.println(raca);
		System.out.println(nome);
		System.out.println(genero);
		System.out.println(idade);
		System.out.println(porteResp);
		System.out.println(peso);
		System.out.println(rg);
		System.out.println();
		
	}
	
	public CadastroBean() {
		super();
	}
	public CadastroBean(String raca, String nome, String genero, int idade, double peso,
			String rg) {
		super();
		this.raca = raca;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.rg = rg;
	}
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getPorteResp() {
		return porteResp;
	}
	public void setPorteResp(String porteResp) {
		this.porteResp = porteResp;
	}
	public List<String> getPorte() {
		List<String> lista = new ArrayList<>();
		lista.add("Pequeno");
		lista.add("Médio");
		lista.add("Grande");
		lista.add("Extra Grande");
		
		return lista;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
	
}
