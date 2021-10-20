import java.util.Scanner;

public class ListaEx02 {

	public static void main(String[] args) {
		/* 2. O professor Wuni Jim Yensonal precisa de um programa para ajudar com um problema simples: para uma turma com 50 alunos precisa calcular a m�dia da sala e descobrir quais s�o os alunos que precisar�o de um atendimento personalizado. O fluxo do programa deve ser o seguinte:
A. Digitar as 50 notas em um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
B. Calcular a m�dia das notas digitadas
C. Para cada uma das notas que foi digitada e ficou abaixo da m�dia, exibir uma mensagem que diga �Chamar o aluno para conversar� */
		
		Scanner leitor = new Scanner(System.in);
		double notas[] = new double[3];
		String nomesDosAlunos[] = new String[notas.length];
		double media = 0;
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota do " + (i + 1) + "� aluno: ");
			notas[i] = leitor.nextDouble();
			System.out.println("Informe o nome do aluno: ");
			nomesDosAlunos[i] = leitor.next();
			media += notas[i];
		}
		
		media = media / (double)notas.length;
		
		for(int i = 0; i < notas.length; i++) {
			if(notas[i] < media) {
				System.out.println("O aluno " + nomesDosAlunos[i] + " tirou uma nota abaixo da m�dia. Voc� deve cham�-lo para conversar!");
			}
		}
		

	}

}
