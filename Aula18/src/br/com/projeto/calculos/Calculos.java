package br.com.projeto.calculos;

public class Calculos {
	
	public Double somarDoisNumeros(Double valor1, Double valor2) {
		return valor1 + valor2;
	}
	
	public Double subtrairDoisNumeros(Double valor1, Double valor2) {
		return valor1 - valor2;
	}
	
	public Double multiplicarDoisNumeros(Double valor1, Double valor2) {
		return valor1 * valor2;
	}
	
	public Double dividirDoisNumeros(Double valor1, Double valor2) {
		return valor1 / valor2;
	}
	
	public Double restoDaDivisaoDoisNumeros(Double valor1, Double valor2) {
		return valor1 % valor2;
	}
	
	public Double acrescentarUmNumero(Double valor) {
		return ++valor;
	}
	
	public Double reduzirUmNumero(Double valor) {
		return --valor;
	}
	
	public void valorMaiorOuMenor(Double valor1, Double valor2) {
		if (valor1 > valor2) {
			System.out.println("O valor " + valor1 + " é maior que " + valor2);
		}
		else if (valor1 < valor2) {
			System.out.println("O valor " + valor1 + " é menor que " + valor2);
		}
		else System.out.println("Os valores " +valor1 + " e " + valor2 + " são iguais");
	}
	
	public void exemploWhile() {
		Integer valor = 5;
		while (valor < 10) {
			System.out.println("Valor = " + valor);
			valor++;
		}
	}

}
