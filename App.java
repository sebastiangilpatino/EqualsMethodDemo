package EmployeeEquals;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Jorge";

		double salary = 20000;
		LocalDate dob = LocalDate.now();

		BankAccount b1 = new BankAccount("123-456-789", 3000);
		BankAccount b2 = new BankAccount("111-222-333", 4000);
		BankAccount b3 = new BankAccount("444-555-666", 5000);

		List<BankAccount> accounts = new ArrayList<BankAccount>();
		accounts.add(b1);
		accounts.add(b2);
		accounts.add(b3);

		Employee emp1 = new Employee(name, salary, dob, b1, accounts);
		Employee emp2 = new Employee(name, salary, dob, b1, accounts);

		System.out.println(emp1.equals(emp2));

	}

}
