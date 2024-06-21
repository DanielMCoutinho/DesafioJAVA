package desafioJava1;

import java.util.Scanner;

public class CodigoProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o c�digo do produto");
		int codigo = sc.nextInt();
		
		if (codigo >= 1 && codigo <= 10){
			System.out.println("Alimento n�o-perec�vel");
			
		} else if (codigo<=20) {
			System.out.println("Alimento perec�vel");
			
		} else if (codigo<=30) {
			System.out.println("Vestu�rio");
			
		}else if (codigo<=40) {
			System.out.println("Eletr�nicos");
			
		}else {
			System.out.println("C�digo inv�lido");
		}
		sc.close();
	}
}









 // 9)Escreva um programa que leia o c�digo de um produto e informe a sua
 // categoria: 1 a 10: Alimento n�o-perec�vel 11 a 20: Alimento perec�vel 21 a
 // 30: Vestu�rio 31 a 40: Eletr�nicos Outros: C�digo inv�lido
 
