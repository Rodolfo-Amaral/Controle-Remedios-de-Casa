package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Remedios;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("ESTE PROGRAMA TEM COMO OBJETIVO MOSTRAR A LISTAGEM DE REM�DIOS DISPON�VEIS EM NOSSA CAIXINHA DE REM�DIOS E TAMB�M MOSTRAR A PATOLOGIA DE CADA UM, FACILITANDO A LOCALIZA��O DELES PARA CADA TIPO DE SINTOMA QUE TEMOS.");*/
		List<Remedios> listRem = new ArrayList<>();
		
		System.out.println("Quantos medicamentos h� na sua caixinha?");
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Digite o nome do medicamento: ");
			String nome = sc.nextLine();
			System.out.println("Quantas unidades?");
			int qtde = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual a apresenta��o? (ml/mg/g...)");
			String presentTx = sc.next();
			System.out.println("Qual a quantidade em " + presentTx + "?");
			int present = sc.nextInt();
			sc.nextLine();
			System.out.println("Qual a patologia dele (Sintoma/para que ele serve)?");
			String pato = sc.nextLine();			
			listRem.add(new Remedios(nome, qtde, present, presentTx, pato));			
		}
		Integer somaQtde = 0;
		for (Remedios rem : listRem) {
			somaQtde += rem.qtde;  
			
		}
		System.out.println("Voc� possui "+somaQtde+" rem�dios na caixinha e estes s�o: ");
		System.out.println(listRem.toString());
			
		sc.close();

	}

}
