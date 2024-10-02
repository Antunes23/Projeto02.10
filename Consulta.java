package Construtores;

public class Consulta {
	private String nomeDents;
	private String data;
	private String nomePente;


	public Consulta (String nomeDents) {
		this.nomeDents = nomeDents;
	}

	public Consulta(String nomeDents, String data, String nomePente) {
		this.nomeDents = nomeDents;
		this.data = data;
		this.nomePente = nomePente;
	}

	public String getnomeDents() {
		return nomeDents;
	}

	public void setnomeDents (String nomeDents) {
		this.nomeDents = nomeDents;
	}
	public String getdata() {
		return data;
	}
	public void setdata(String data) {
		this.data = data;
	}
	public String getnomePente() {
		return nomePente;
	}
	public void setnomeData(String nomeData) {
	this.nomePente = nomeData;
	}
	
}