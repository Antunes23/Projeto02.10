package Construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro("AER723" ,18768 );
		Carro carro3 = new Carro("HFR345");

		System.out.println(carro2.getplaca());
		System.out.println(carro2.getnumChassi());

		System.out.println(carro3.getplaca());
		System.out.println(carro3.getnumChassi());
	}

}

