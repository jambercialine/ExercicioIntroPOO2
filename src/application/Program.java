package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee emp = new Employee ();
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salário bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.taxa = sc.nextDouble();
		
		System.out.println("Funcionário" +  emp);
		
		System.out.println();
		System.out.print(" Entre com uma porcentagem: ");
		double porcentagem = sc.nextDouble();
		emp.incrementoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualização dos dados: " + emp);
		
		sc.close();

	}

}
