package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Declaração;
import entities.Pessoa_Fisica;
import entities.Pessoa_Juridica;

public class Application {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Declaração> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa Juridica(J) ou Pessoa Física(F)? ");
			char ch = sc.next().charAt(0);
			System.out.println();
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if(ch == 'J') {
				System.out.print("Numero de Empregados: ");
				int numeroDeFuncionarios = sc.nextInt();
				list.add(new Pessoa_Juridica(name, rendaAnual, numeroDeFuncionarios));
			}else if(ch == 'F') {
				System.out.print("Gastos com Saúde: ");
				Double gastosComSaude = sc.nextDouble();
				list.add(new Pessoa_Fisica(name, rendaAnual, gastosComSaude));
			}else {
				System.out.println("Modalidade Invalida");
			}
			
}
			
		System.out.println();
		System.out.println("Valores pagos de imposto: ");
		for(Declaração dec : list) {
			System.out.println(dec.getName() + ": $ " + String.format("%.2f", dec.imposto()));
			
			}

		sc.close();
}


}
