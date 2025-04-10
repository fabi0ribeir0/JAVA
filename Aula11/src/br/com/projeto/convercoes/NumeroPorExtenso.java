package br.com.projeto.convercoes;

public class NumeroPorExtenso {
	
	public String extenso(Integer num) {
		Integer posicaoUnidade, posicaoDecimal;
		String extenso = "";
		String conexao;
		String[] unidade = new String[10];
		String[] dezena = new String[10];
		String[] dezenaEspecial = new String[10];
		
		unidade[0] = "";
		unidade[1] = "um";
		unidade[2] = "dois";
		unidade[3] = "três";
		unidade[4] = "quatro";
		unidade[5] = "cinco";
		unidade[6] = "seis";
		unidade[7] = "sete";
		unidade[8] = "oito";
		unidade[9] = "nove";
		
		dezena[0] = "";
		dezena[1] = "dez";
		dezena[2] = "vinte";
		dezena[3] = "trinta";
		dezena[4] = "quarenta";
		dezena[5] = "cinquenta";
		dezena[6] = "sessenta";
		dezena[7] = "setenta";
		dezena[8] = "oitenta";
		dezena[9] = "noventa";
		
		dezenaEspecial[0] = "dez";
		dezenaEspecial[1] = "onze";
		dezenaEspecial[2] = "doze";
		dezenaEspecial[3] = "treze";
		dezenaEspecial[4] = "quatorze";
		dezenaEspecial[5] = "quinze";
		dezenaEspecial[6] = "dezesseis";
		dezenaEspecial[7] = "dezessete";
		dezenaEspecial[8] = "dezoito";
		dezenaEspecial[9] = "dezenove";
		
		if(num >= 1 && num <= 99) {
			posicaoDecimal = num / 10;
			posicaoUnidade = num % 10;
			
			conexao = "";
			
			if(posicaoDecimal > 0 && posicaoUnidade > 0) {
				conexao = " e ";
			}
			
			if(num >= 10 && num <= 19) {
				extenso = dezenaEspecial[posicaoUnidade];
			} else {
				extenso = dezena[posicaoDecimal] + conexao + unidade[posicaoUnidade];
			}
		}
		return extenso;
	}
}
