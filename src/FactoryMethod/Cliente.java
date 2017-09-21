package FactoryMethod;

public class Cliente {
	public static void main(String[] args) {
		FabricaDeCarro fabrica = new FabricaFord();
		Carro carro = fabrica.criarCarro();
		carro.exibirInfo();
		System.out.println();
	}
}
