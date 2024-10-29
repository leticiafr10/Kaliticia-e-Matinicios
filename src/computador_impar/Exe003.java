package computador_impar;

import java.util.Scanner;

public class Exe003 {

	public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("digite um valor inteiro: ");
         int num = scanner.nextInt();
         
         int soma = 0;
         
         for(int i = 2; i<= num; i += 2 ) {
        	 soma += i;
         }
         System.out.println("a soma dos numeros pares é: " + soma);
	}

}
