package computador_impar;
import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número para multiplicarmos seus inpares");
		int num_usu = input.nextInt();
		int resultado = 1;
		
		for(int i =1; i <= num_usu; i+=2) {
			resultado *= i;
		}
		System.out.println("Soma dos números: " + resultado);
	}
}