package Construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {

		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("Guilherme", "10/12/2024" ,"Otávio");
		Consulta consulta3 = new Consulta("Welligton" , "12/08/2025" , "Gerson");

		System.out.println(consulta2.getnomeDents());
		System.out.println(consulta2.getdata());
		System.out.println(consulta2.getnomePente());

		System.out.println(consulta3.getnomeDents());
		System.out.println(consulta3.getdata());
		System.out.println(consulta3.getnomePente());

	}

}
