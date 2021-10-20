import java.util.Scanner;

public class ListaEx01 {

	public static void main(String[] args) {
		/* Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa.  */
		Scanner leitor = new Scanner(System.in);
		String atividades[] = new String[30];
		int ordem;
		
		for(int i = 0; i < atividades.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª atividade: ");
			atividades[i] = leitor.nextLine();
		}
		
		System.out.println("Você deseja ver as atividades na ordem que digitou ou na ordem inversa?");
		System.out.println("1 - Ordem digitada");
		System.out.println("2 - Ordem inversa");
		ordem = leitor.nextInt();
		
		switch(ordem) {
		case 1:
			for(int i = 0; i < atividades.length; i++) {
				System.out.println("Atividade " + (i + 1) + ": " + atividades[i]); 
			}
			break;
		case 2:
			for(int i = atividades.length - 1; i >= 0; i--) {
				System.out.println("Atividade " + (i + 1) + ": " + atividades[i]); 
			}
			break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
		

	}

}
