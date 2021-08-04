package br.com.matheus.lista1;

public class Questao11 {

	public Questao11() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verificaMultiplos(35,7);
	}
	
	public static void verificaMultiplos (int a, int b) {
		int resto = 0;
		
		if (a > b) {
			resto = a%b;
		} else if (b > a) {
			resto = b%a;
		} 
		
		if (resto == 0) {
			System.out.print("Os números informados SÃO múltoplos!");
		} else {
			System.out.print("Os números informados NÃO SÃO múltiplos! ");
		}
	}

}
