package br.com.kb.tdd.service;

import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.entities.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
    public void makeReadjust(Employee employee, Performance performance) {

        if(performance == Performance.POOR){
           BigDecimal readjust =  employee.getSalary().multiply(new BigDecimal("0.03"));
           employee.readjustSalary(readjust);
        }

    }
}
