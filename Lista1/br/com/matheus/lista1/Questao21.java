package br.com.matheus.lista1;

import java.util.ArrayList;
import java.util.List;

public class Questao21 {

	public Questao21() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void calculaPrecoUmProduto (String codigoProduto, int qtdProdutos) {
		Double preco = retornaPrecoByCodigo(codigoProduto);
		if (preco == 0.00) {
			System.out.print("Código inválido!");
		} else {
			System.out.print("O valor total é R$" + preco*qtdProdutos);
		}
	}
	
	public static void calculaPrecoVariosProdutos (List<String> codigosProdutos, List<Integer> qtdProdutos) {
		List<Double> precos = new ArrayList(); 
		Double precoTotal = 0.00;
		Double preco = 0.00;
		
		for (int i=0; i <= codigosProdutos.size(); i++) {
			preco = retornaPrecoByCodigo(codigosProdutos.get(i));
			
			precos.add(preco);
			
			if (preco == 0.00) {
				System.out.print("Código " + codigosProdutos.get(i) + " inválido!");
			}
			
			precoTotal += preco*qtdProdutos.get(i);
		}
		
		System.out.print("Preço total da compra: R$" + precoTotal);
	}
	
	public static Double retornaPrecoByCodigo (String codigoProduto) {
		Double retorno;
		 switch (codigoProduto) {
		 	case "ABCD":
		 		retorno =  5.30;
		 		break;
		 		
		 	case "XYPK":
		 		retorno = 6.00;
		 		break;
		 		
		 	case "KLMP":
		 		retorno = 3.20;
		 		break;
		 		
		 	case "QRST":
		 		retorno =  2.50;
		 		break;
		 		
		 	default:
		 		retorno = 0.00;
		 }
		 return retorno;
	}

}
