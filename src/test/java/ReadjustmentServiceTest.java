import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.entities.Performance;
import br.com.kb.tdd.service.ReadjustmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    private ReadjustmentService service;
    private Employee employee;

    @BeforeEach
    public void init(){
        this.service = new ReadjustmentService();
        this.employee = new Employee("Kb", LocalDate.now(), new BigDecimal(("1000.00")));
    }

    @Test
    public void threePercentReadjustForPoorPerformance(){
        service.makeReadjust(employee, Performance.POOR);
        assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }

    @Test
    public void fifteenPercentReadjustForGoodPerformance(){
        service.makeReadjust(employee, Performance.GOOD);
        assertEquals(new BigDecimal("1150.00"), employee.getSalary());
    }

    @Test
    public void twentyPercentReadjustForAwesomePerformance(){
        service.makeReadjust(employee, Performance.AWESOME);
        assertEquals(new BigDecimal("1200.00"), employee.getSalary());
    }

}
