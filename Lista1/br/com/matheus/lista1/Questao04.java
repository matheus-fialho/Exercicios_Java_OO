/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;

/*
 * 4. Faça um algoritmo que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
public class Questao04 {

	public void converteIdade (int dias) {
		System.out.print(dias + "dias, equivalem a ");
		int resto = dias;
		int anos = 0; 
		int meses = 0;
		
		if (resto >= 365) {
			anos = dias/365;
			resto = dias%365;
			dias = dias%365;
		}
		if (resto >= 30) {
			meses = resto/30;
			dias = resto%30;
		}
		
		System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias.");
	}
}
