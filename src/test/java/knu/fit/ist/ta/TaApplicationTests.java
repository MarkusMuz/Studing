package knu.fit.ist.ta;

import java.util.ArrayList;
import java.util.List;
import knu.fit.ist.ta.lab2.Calculate;
import knu.fit.ist.ta.lab4.Lab2Calc;
import knu.fit.ist.ta.lab5.Searching;
import knu.fit.ist.ta.lab5.Sorting;
import knu.fit.ist.ta.lab6.Recursion;
import knu.fit.ist.ta.lab6.Tree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TaApplicationTests {

    @Test
    void contextLoads1() {
        assertEquals(0.33f, Calculate.lab2equation(1), 0.01f);
        assertEquals(0.09f, Calculate.lab2equation(3), 0.01f);
    }

    @Test
    void contextLoads2() {
        int[] x = {41, 56, 73, 95};
        assertEquals("1", Calculate.lab3nsd(x));
        int[] y = {15, 30, 45, 95, 15};
        assertEquals("5", Calculate.lab3nsd(y));
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
        List<Integer> ans = new ArrayList<>();
        ans.add(-1);
        text.add("A");
        text.add("Z");
        text.add("O");
        Searching list = new Searching();
        assertEquals(ans, list.linearSearch("U", text));
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(1);
        assertEquals(ans2, list.linearSearch("Z", text));
    }

    @Test
    void contextLoads6() {
        int temp = Integer.MIN_VALUE;
        Recursion list1 = new Recursion();
        assertEquals(temp, list1.geom(20, 50, -3));
        Recursion list2 = new Recursion();
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(5);
        ans2.add(20);
        ans2.add(80);
        ans2.add(320);
        temp = list2.geom(5, 4, 4);
        assertEquals(ans2, list2.getarrayToReturn());
    }
    
    @Test
    void contextLoads7() {
        Tree tree = new Tree();
        
        tree.add(7);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(9);
        tree.add(5);
        tree.add(6);
        tree.add(10);
        
        assertEquals(true, tree.containsNode(5));
        assertEquals(false, tree.containsNode(27));
        List<Integer> treeCorrect = new ArrayList<>();
        treeCorrect.add(3);
        treeCorrect.add(4);
        treeCorrect.add(5);
        treeCorrect.add(6);
        treeCorrect.add(7);
        treeCorrect.add(8);
        treeCorrect.add(9);
        treeCorrect.add(10);
        tree.traverseInOrder(tree.root);
        assertEquals(treeCorrect, tree.inOrder);
        
        
    }
    
    @Test
    void contextLoads8() {
        List<Integer> ans = new ArrayList<>();
        Sorting list = new Sorting(0);
        assertEquals(ans, list.sortApproach2());
        assertEquals(ans, list.sortApproach3());
        Sorting list2 = new Sorting(1);
        List<Integer> ans2 = new ArrayList<>();
        ans2.add(0);
        assertEquals(ans2,list2.sortApproach2());
        assertEquals(ans2,list2.sortApproach3());
        Sorting list3 = new Sorting(10000);
        int ans3 = 1000;
        int ans4 = 50;
        list2.sortApproach2();
        list2.sortApproach3();
        assertTrue(list3.time1<ans3);
        assertTrue(list3.time2<ans4);
    }
}
