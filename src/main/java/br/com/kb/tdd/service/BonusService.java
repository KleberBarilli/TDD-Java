package br.com.kb.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.kb.tdd.entities.Employee;

public class BonusService {

	public BigDecimal calculate(Employee employee) {
		BigDecimal amount = employee.getSalary().multiply(new BigDecimal("0.1"));
		if (amount.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Employee with salary higher than 1000");
		}
		return amount.setScale(2, RoundingMode.HALF_UP);
	}

}
