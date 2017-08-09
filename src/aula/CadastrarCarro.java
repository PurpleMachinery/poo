package aula;

public class CadastrarCarro {
	public static void main(String args[]) {
		Carro carro = new Carro();
		carro.modelo = "uno";
		carro.ano = 1994;
		carro.cor = "preto";

		System.out.println("Modelo: " + carro.modelo);
	}
}
