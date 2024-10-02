package Construtores;

public class Animal {
	private float tamanho;
	private String cor;
	
	
	public Animal(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public Animal(float tamanho, String cor) {
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public float gettamanho() {
		return tamanho;
	}
	
	public void settamanho (float tamanho) {
		this.tamanho = tamanho;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}

}