package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

	@Test
	void contextLoads() {
            int[] x={41,56,73,95};
            assertEquals("1",Calculate.lab3nsd(x));
	}

}
