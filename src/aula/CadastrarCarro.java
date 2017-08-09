package aula;

public class CadastrarCarro {
	public static void main(String args[]) {
		Carro carro = new Carro();
		
		carro.modelo = "uno";
		carro.ano = 1994;
		carro.cor = "preto";

		Carro carro_um = new Carro();
		
		carro_um.modelo = "Palio";
		carro_um.ano = 2007;
		carro_um.cor = "Vermelhor";
		
		System.out.println("Modelo: " + carro.modelo);
		
	}
}
