package knu.fit.ist.ta;

import knu.fit.ist.ta.lab2.Calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

	@Test
	void contextLoads() {
            assertEquals(0.33f,Calculate.lab2equation(1),0.01f);
            assertEquals(0.09f,Calculate.lab2equation(3),0.01f);
	}
        
        @Test
	void contextLoads2() {
            int[] x={41,56,73,95};
            assertEquals("1",Calculate.lab3nsd(x));
            int[] y={15,30,45,95,15};
            assertEquals("5",Calculate.lab3nsd(y));
	}

}
