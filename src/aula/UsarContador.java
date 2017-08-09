package aula;

public class UsarContador {
	public static void main(String args[]) {
		Contador c = new Contador();
		c.incrementar();
		System.out.println(c.count);           //   <--Usando o objeto c com a classe count-->
		Contador.count++;
		System.out.println(Contador.count);    //   <--Usando o objeto count da classe Contador-->
	}
}
