package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import intenties.Apartment;
import intenties.Bank;
import intenties.Company;

public class Program {

	public static void main(String[] args) {
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rectangle.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rectangle.diagonal()));
		
		sc.close();
		*/
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		
		double percentage = sc.nextDouble(); 
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data : " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		sc.close();
		*/
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.result()));
		if(student.result() >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", student.lack()) + " POINTS");
		}
		
		sc.close();
		*/
		
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought?");
		double howMany = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.calculator(dollar, howMany));
		
		sc.close();
		*/
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank;
		
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account houlder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char simNao = sc.next().charAt(0);
		
		if(simNao == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			bank = new Bank(conta, nome, saldo);
		}else {
			bank = new Bank(conta, nome);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		bank.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		bank.saque(saque);
		System.out.println("Updated account data: ");
		System.out.println(bank);
		
		sc.close();
		*/
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Apartment[] apto = new Apartment[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			apto[room] = new Apartment(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i=0; i<apto.length; i++) {
			if(apto[i] != -1) {
				System.out.println(apto[i].getRoom() + ": " + apto[i].getName() + ", " + apto[i].getEmail());
			}
		}
		
		sc.close();
		*/
		//==========================================================================================
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		Integer n = sc.nextInt();
		int count = 0;
		List<Company> company = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			count += 1;
			System.out.println();
			System.out.println("Emplyoee #" + count + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			company.add(new Company(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idEmployee = sc.nextInt();
		
		Double percentage = 0.0;
		for(Company x : company) {
			if(x.getId().equals(idEmployee)) {
				System.out.print("Enter the percentage: ");
				percentage = sc.nextDouble();
				x.increase(percentage);
			}
		}
		
		if(percentage == 0.0) {
			System.out.print("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Company x : company) {
			System.out.println(x.getId() + ", " + x.getName() + ", " + String.format("%.2f", x.getSalary()));
		}
		
		sc.close();
		*/
		//==========================================================================================
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer m = sc.nextInt();
		Integer n = sc.nextInt();
		
		Integer[][] matrix = new Integer[m][n];
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		Integer number = sc.nextInt();
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] == number) {
					System.out.println("Position " + i + "," + j + ":");
					if(j-1 >= 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if(j+1 < matrix[i].length) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if(i-1 >= 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if(i+1 < matrix.length) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
