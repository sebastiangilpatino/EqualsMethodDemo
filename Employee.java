package EmployeeEquals;

import java.time.LocalDate;

import java.util.List;
import java.util.Objects;

public class Employee {
	String name;
	double salary;
	LocalDate dob;
	BankAccount b1;
	List<BankAccount> accounts;

	public Employee(String name, double salary, LocalDate dob, BankAccount b1, List<BankAccount> accounts) {
		super();
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.b1 = b1;
		this.accounts = accounts;
	}

	// you must also override hash code and equals on the other
	// no primitive data members, if don't, it doesn't works

	@Override
	public int hashCode() {
		return Objects.hash(accounts, b1, dob, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		return Objects.equals(accounts, other.accounts) && Objects.equals(b1, other.b1)
				&& Objects.equals(dob, other.dob) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

}
