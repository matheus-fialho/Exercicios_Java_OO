/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;

/*
 * 3. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa apenas em dias.

 */
public class Questao03 {
	
	public int converteIdadeEmDias (int anos, int meses, int dias) {
		int totalDias = anos*365;
		totalDias = totalDias + (meses*30);
		totalDias += dias;
		
		return totalDias;
	}

}
