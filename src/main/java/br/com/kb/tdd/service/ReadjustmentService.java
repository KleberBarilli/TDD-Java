package br.com.kb.tdd.service;

import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.entities.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
    public void makeReadjust(Employee employee, Performance performance) {

        BigDecimal percent = performance.readjustPercentage();
        BigDecimal readjust = employee.getSalary().multiply(percent);
        employee.readjustSalary(readjust);

    }
}
