/**
 * @author Matheus Fialho
 *
 */
package br.com.matheus.lista1;


/*
 * 1. Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no
plano, P(x1,y1) e P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo 
d = raiz quardada ((x2-x1)² + (y2-y1)²)
 */
public class Questao01 {
	
	
	public float distanciaEntrePontos(float x1, float y1, float x2, float y2) {
		float d = (float) Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		return d;
	}
	
	public void testeMetodo() {
		float distancia = distanciaEntrePontos(2,2,12,2);
		System.out.println(distancia);
	}

}
