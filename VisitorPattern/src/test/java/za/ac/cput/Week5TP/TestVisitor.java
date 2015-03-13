package za.ac.cput.Week5TP;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */

//Could not think of my own example
public class TestVisitor extends TestCase {

    TwoElement two1;
    TwoElement two2;
    ThreeElement three1;
    List<NumberElement> numberElements;

    @Override
    public void setUp() throws Exception {
        two1 = new TwoElement(3, 3);
        two2 = new TwoElement(2, 7);
        three1 = new ThreeElement(3, 4, 5);
        numberElements = new ArrayList<NumberElement>();
        numberElements.add(two1);
        numberElements.add(two2);
        numberElements.add(three1);

    }

    public void testVistor() throws Exception {

        System.out.println("Visiting element list with SumVisitor");
        NumberVisitor sumVisitor = new SumVisitor();
        sumVisitor.visit(numberElements);

        System.out.println("\nVisiting element list with TotalSumVisitor");
        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();
        totalSumVisitor.visit(numberElements);
        System.out.println("Total sum:" + totalSumVisitor.getTotalSum());



    }
}
