/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;

/*
 * 6. Faça um algoritmo que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
public class Questao06 {

	public Questao06() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void converTempo(int segundos) {
		int minutos = 0;
		int horas = 0;
		
		System.out.print(segundos + " segundos é equivalente a ");
		
		if (segundos >= 3600) {
			horas = segundos/3600;
			segundos = segundos%3600;
		}
		if (segundos >= 60) {
			minutos = segundos/60;
			segundos = segundos%60;
		}
		
		System.out.print(horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
	}

}
