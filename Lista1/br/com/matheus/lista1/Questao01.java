/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;


/*
 * 1. Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no
plano, P(x1,y1) e P(x2,y2), escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo 
d = raiz quardada ((x2-x1)� + (y2-y1)�)
 */
public class Questao01 {
	
	
	public Double distanciaEntrePontos(Double x1, Double y1, Double x2, Double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
	
	public void testeMetodo() {
		System.out.println(distanciaEntrePontos(2.0,2.0,12.0,2.0));
	}

}
