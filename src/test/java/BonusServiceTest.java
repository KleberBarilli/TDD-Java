import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @Test
    void zeroBonusForEmployeeWithHighSalary(){
        BonusService  service = new BonusService();
        BigDecimal  bonus = service.calculate(new Employee("Kleber", LocalDate.now(), new BigDecimal("1000000")));
        assertEquals(new BigDecimal("0.00"), bonus);

    }

    @Test
    void tenPercentBonusSalary(){
        BonusService  service = new BonusService();
        BigDecimal  bonus = service.calculate(new Employee("Kleber", LocalDate.now(), new BigDecimal("2500")));
        assertEquals(new BigDecimal("250.00"), bonus);

    }
    @Test
    void tenPercentBonusSalaryFor10K(){
        BonusService  service = new BonusService();
        BigDecimal  bonus = service.calculate(new Employee("Kleber", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);

    }
}
