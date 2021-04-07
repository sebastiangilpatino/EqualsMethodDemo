package EmployeeEquals;

import java.util.Objects;

public class BankAccount {
	String number;
	double money;

	public BankAccount(String number, double money) {
		super();
		this.number = number;
		this.money = money;
	}

	@Override
	public int hashCode() {
		return Objects.hash(money, number);
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
		BankAccount other = (BankAccount) obj;
		return Double.doubleToLongBits(money) == Double.doubleToLongBits(other.money)
				&& Objects.equals(number, other.number);
	}

}
