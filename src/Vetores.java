import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double alunos[] = new double[3];
		double total = 0;
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Por favor, digite o consumo do " + (i + 1) + "� aluno");
			alunos[i] = leitor.nextDouble();
			total += alunos[i];
		}
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("O aluno " + (i + 1) +" consumiu R$" + alunos[i]);
		}
		
		System.out.println("O consumo total foi de R$" + total);
		
		leitor.close();
		

	}

}
