package br.com.projeto.principal;

import java.util.Scanner;

import br.com.projeto.calculos.Calculos;
import br.com.projeto.convercoes.NumeroPorExtenso;

public class Executadora {
	public static void main(String[] args) {
		/*
		Calculos calculos = new Calculos();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor decimal: ");
		Double valor1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor decimal: ");
		Double valor2 = ler.nextDouble();
		
		System.out.println("A Soma entre os valores é: " + calculos.somarDoisNumeros(valor1, valor2));
		
		calculos.valorMaiorOuMenor(valor1, valor2);
		
		calculos.exemploWhile();
		
		
		String primeiroTexto = "Exemplo";
		String segundoTexto = "Exempo";
		
		if(primeiroTexto == segundoTexto) {
			System.out.println("IGUAL");
		}else System.out.println("DESIGUAL");
		*/
		NumeroPorExtenso n = new NumeroPorExtenso();
		for (int i = 1; i < 100 ; i++) {
			System.out.println(n.extenso(i));
		}
	}
}
 