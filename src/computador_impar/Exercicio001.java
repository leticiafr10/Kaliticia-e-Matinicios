package computador_impar;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===CAIXA ELETRONICO===");
		
		System.out.print("Digite o valor que deseja sacar: ");
        int valor = scanner.nextInt();
        
        
        int[] notas = {100, 50, 20, 10, 5, 2};
        int quantiNotas100 = 0;
        int quantiNotas50 = 0;
        int quantiNotas20 = 0;
        int quantiNotas10 = 0;
        int quantiNotas2 = 0;
        int quantiNotas5 = 0;
        
        
        if (valor >= 100) {
            quantiNotas100 = valor / 100;
            valor = valor % 100;
        
	    }
        if (valor >= 50) {
            quantiNotas50 = valor / 50;
            valor = valor % 50;
            
        }
        if (valor >= 20) {
            quantiNotas20 = valor / 20;
            valor = valor % 20;
            
        }
        if (valor >= 10) {
            quantiNotas10 = valor / 10;
            valor = valor % 10;
            
        }
        if (valor >= 2) {
            quantiNotas2 = valor / 2;
            valor = valor % 2;
            
        }
        if (valor >= 5) {
            quantiNotas5 = valor / 5;
            valor = valor % 5;
            
        }
        
        System.out.println("Notas fornecidas:");
        if (quantiNotas100 > 0) System.out.println(quantiNotas100 + " nota(s) de R$ 100");
        if (quantiNotas50 > 0) System.out.println(quantiNotas50 + " nota(s) de R$ 50");
        if (quantiNotas20 > 0) System.out.println(quantiNotas20 + " nota(s) de R$ 20");
        if (quantiNotas10 > 0) System.out.println(quantiNotas10 + " nota(s) de R$ 10");
        if (quantiNotas5 > 0) System.out.println(quantiNotas5 + " nota(s) de R$ 5");
        if (quantiNotas2 > 0) System.out.println(quantiNotas2 + " nota(s) de R$ 2");
        
        scanner.close();
       

		}
}
