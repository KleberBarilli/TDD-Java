import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.service.BonusService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {
    private BonusService service;


    @BeforeEach()
    public void initialize() {
        this.service = new BonusService();
    }

    @Test
    void exceptionForEmployeeWithHighSalary() {

        assertThrows(IllegalArgumentException.class,
                () -> service.calculate(new Employee("Kleber", LocalDate.now(),
                        new BigDecimal("1000000"))));

    }

    @Test
    void tenPercentBonusSalary() {
        BigDecimal bonus = service.calculate(new Employee("Kleber", LocalDate.now(),
                new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);

    }

    @Test
    void tenPercentBonusSalaryFor10K() {
        BigDecimal bonus = service.calculate(new Employee("Kleber", LocalDate.now(),
                new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);

    }
}
