package br.com.fiap.main;

public class Carro {
	
	private int codigo, ano;
	private String marca, modelo, cor;
	private double valor;
	
	public Carro() {
		super();
	}
	
	public Carro(int codigo, int ano, String marca, String modelo, String cor, double valor) {
		super();
		this.codigo = codigo;
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.valor = valor;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
}
