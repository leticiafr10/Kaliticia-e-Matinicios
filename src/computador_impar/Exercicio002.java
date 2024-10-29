package computador_impar;
import java.util.Scanner;

public class Exercicio002 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tentativas = 7;
		boolean acertou = false;
		
		System.out.println("Digite um número de 1 a 100 para outro usúario tentar adivinhar: ");
		int num_adv = input.nextInt();
		
		System.out.println("Agora tente advinhar o número, você tem 7 tentativas, vamos informar se ele é maior ou menor que o escolhido");
		for( int i = 1 ; i<= tentativas; i++) {
		System.out.println("Tente Advinhar: ");
		int usu_tent = input.nextInt();
		
			if (usu_tent < num_adv) {
				System.out.println("Esse número é menor");
			}
			else if (usu_tent > num_adv) {
				System.out.println("Esse número é maior");
			}
			else if (usu_tent == num_adv) {
				System.out.println("Você acertou !!");
				System.out.println("Parabéns, reinicie se quiser jogar novamente");
				acertou = true;
				break;			}
				}
		
			if (!acertou){
			System.out.println("Suas tentativas acabaram, se quiser tente novamente");
			}
			
			input.close();
		}
	}
