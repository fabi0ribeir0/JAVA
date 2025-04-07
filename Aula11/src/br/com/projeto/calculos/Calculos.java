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
}
