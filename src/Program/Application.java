package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Declaração;

public class Application {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Declaração> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa Juridica ou Pessoa Física (PJ/PF)? ");
			String pessoa = sc.next();
			System.out.println();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			if(pessoa == "PJ") {
				System.out.print("Numero de Empregados: ");
				Integer numeroDeFuncionarios = sc.nextInt();
			}else {
				System.out.print("Gastos com Saúde: ");
				Double gastosComSaude = sc.nextDouble();
			}
			
			}

		sc.close();
}


}
