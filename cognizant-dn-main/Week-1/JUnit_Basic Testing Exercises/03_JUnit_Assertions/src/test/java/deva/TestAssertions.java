package deva;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestAssertions {

    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        System.out.println("assertEquals Successful");

        assertTrue(5 > 3);
        System.out.println("assertTrue Successful");

        assertFalse(5 < 3);
        System.out.println("assertFalse Successful");

        assertNull(null);
        System.out.println("assertNull Successful");

        assertNotNull(new Object());
        System.out.println("assertNotNull Successful");
    }
}
