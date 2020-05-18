import java.util.Scanner;
public class PrimeiraClasse {

	public static void main(String[] args) {
		// entrada de notas
		Scanner ent = new Scanner(System.in);
		
		double N1 = 0;
		double N2 = 0;
		double N3 = 0;
		double N4 = 0;
		double media;
		double ponto = 10;
		
		System.out.println("Digite o nome do Aluno: ");
	    ent.nextLine();
		System.out.println("Digite a nota da Prova: ");
		N1 = ent.nextDouble();
		System.out.println("Digite a nota do Projeto: ");
		N2 = ent.nextDouble();
		System.out.println("Digite a nota das Listas de Exercícios: ");
		N3 = ent.nextDouble();
		System.out.println("Digite a nota das Atividades Complementares (Projetos, MOOCS...etc) recomendados pelo docente: ");
		N4 = ent.nextDouble();
		
		// media dividir pela quantidade de pesos
		media = (N1*3 + N2*3 + N3*2 + N4*3)/11;
		System.out.println("Média no Semestre: " + media );
		
		
		if ( media >= 8 ) {
			System.out.println("Aluno Aprovado");
		} else if( media < 8 && media >= 6 ) {
			System.out.println("O Aluno terá que fazer avaliação final");
		} else if( 10 - media > 6 && media == 8) {
			System.out.println("Aluno Aprovado na Avaliação Final");
		} else if( media < 6) {
			System.out.println("Aluno Reprovado");
		}
	}
}

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
			
			
			
			
		
			

	
	
			
		
	
			
		
			
		
			
			
		
			
			
		
		
	
		
		
		
		
		
		
		
		 
				

	


