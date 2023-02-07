import br.com.kb.tdd.entities.Employee;
import br.com.kb.tdd.entities.Performance;
import br.com.kb.tdd.service.ReadjustmentService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    @Test
    public void threePercentReadjustForPoorPerformance(){
        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Kb", LocalDate.now(), new BigDecimal(("1000.00")));

        service.makeReadjust(employee, Performance.POOR);

        assertEquals(new BigDecimal("1030.00"), employee.getSalary());
    }
}
