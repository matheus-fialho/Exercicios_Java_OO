package br.com.matheus.lista1;

public class Questao07 {

	public Questao07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculaValorCarro(10000.00);
	}
	
	public static void calculaValorCarro (Double custoFabrica) {
		Double custoTotal = custoFabrica + (custoFabrica*0.28) + (custoFabrica*0.45);
		System.out.print("O custo total do veículo é R$" + custoTotal);
	}

}
