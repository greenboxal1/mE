package mx.iteso;

import org.junit.Before;
import org.junit.Test;import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class TacitKnowledgePrinterTest {
    Printer printer;
    TacitKnowledgePrinter tacitKnowledgePrinter;

    @Before
    public void setUp(){
        printer = mock(Printer.class);
        tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
    }

    @Test
    public void testPrintNumbersTimes10(){
        tacitKnowledgePrinter.printNumbers(10);
        verify(printer,times(10)).print(anyString());
    }

    @Test(expected = RuntimeException.class)
    public void testPrintNumbersLimitZero(){
        tacitKnowledgePrinter.printNumbers(0);
    }

    @Test
    public void forbiddenTest() { assertTrue(true); }

    @Test
    public void DivIn5And3() { assertEquals(tacitKnowledgePrinter.calculate(15),"TacitKnowledge"); }

    @Test
    public void DivIn3() { assertEquals(tacitKnowledgePrinter.calculate(3),"Tacit"); }

    @Test
    public void DivIn5() { assertEquals(tacitKnowledgePrinter.calculate(5),"Knowledge"); }

    @Test
    public void NotDivIn5And3() { assertEquals(tacitKnowledgePrinter.calculate(2),"2"); }
}
