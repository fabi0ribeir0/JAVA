package br.com.projeto.principal;

import java.util.Scanner;

import br.com.projeto.calculos.Calculos;

public class Executadora {
	public static void main(String[] args) {
		Calculos calculos = new Calculos();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor decimal: ");
		Double valor1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor decimal: ");
		Double valor2 = ler.nextDouble();
		
		System.out.println("A Soma entre os valores é: " + calculos.somarDoisNumeros(valor1, valor2));
		
		calculos.valorMaiorOuMenor(valor1, valor2);
	}
}
