/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;

/*
 * 2. Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e calcule a
seguinte expressão:
D = (R + S)/2, onde R = (A+B)² e S = (B+C)²
 */
public class Questao02 {
	
	public int calcula (int A, int B, int C) {
		Double R = Math.pow((A+B),2);
		Double S = Math.pow((B+C),2);;
		int D = (int) ((R + S)/2);
		
		return D;
	}

}
