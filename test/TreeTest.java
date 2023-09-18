import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

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
    @Test(timeout = 500)
    public void testIsTreeEmpty() {
        Tree<Integer> emptyTree = new Tree<>(null);
        assertTrue(emptyTree.isEmpty());

        Tree<Integer> nonEmptyTree = new Tree<>(1);
        assertFalse(nonEmptyTree.isEmpty());
    }
}