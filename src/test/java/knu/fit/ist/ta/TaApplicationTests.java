package knu.fit.ist.ta;

import java.util.ArrayList;
import java.util.List;
import knu.fit.ist.ta.lab2.Calculate;
import knu.fit.ist.ta.lab4.Lab2Calc;
import knu.fit.ist.ta.lab5.Searching;
import knu.fit.ist.ta.lab5.Sorting;
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
        
        @Test
	void contextLoads4() {
            Lab2Calc ta = new Lab2Calc();          
            assertEquals(275, ta.getArray(ta.text).size());
            assertEquals(171, ta.getSet(ta.text).size());
            assertEquals("202", ta.Task5(ta.text, "p"));
            assertEquals("24", ta.Task6(ta.text, 2));            
            assertEquals(2, ta.getArray("Hello world\n").size());
            assertEquals(2, ta.getSet("Hello world\n").size());
            assertEquals("275", ta.Task5(ta.text, "ii"));
            assertEquals("17", ta.Task6(ta.text, 8));
            assertEquals("0", ta.Task6(ta.text, 15));
	}       

        @Test
	void contextLoads5() {
            List<String> text = new ArrayList<>();
            List<Integer> ans=new ArrayList<>();
            ans.add(-1);
            text.add("A");
            text.add("Z");
            text.add("O");
            Searching list = new Searching();
            assertEquals(ans,list.linearSearch("U", text));
            List<Integer> ans2=new ArrayList<>();
            ans2.add(1);
            assertEquals(ans2,list.linearSearch("Z", text));
        }
}
