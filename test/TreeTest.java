import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A template for a test class in case you decide to write any.
 * The basic structure is the same as pytest which you've used in the past.
 * We'll talk more about testing later in the term.
 */
public class TreeTest {

    @Test(timeout = 500)
    public void dummyTest() {
        assertTrue(true);
    }

    public void TestAverage(){
        Tree t = new Tree();
        assertTrue(t.average() == 0.0);
    }
}