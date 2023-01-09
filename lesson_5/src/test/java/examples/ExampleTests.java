package examples;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import static java.util.Arrays.asList;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

// https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html

public class ExampleTests {

    @Test
    public void shouldGetValueHamcrest() {
        ExampleApp app = new ExampleApp();
        assertThat(app.getValue(), is(equalTo(10)));
    }

    @Test
    public void shouldGetValuePlainJunit() {
        ExampleApp app = new ExampleApp();
        assertEquals(10, app.getValue());
    }

    @Test
    public void shouldAssertsAll() {
        assertAll(
            "Should test multiple conditions",
            () -> assertTrue(true), 
            () -> assertFalse(false)
        );
    }

    @Test
    public void shouldAssertArrayEquals​() {
        int[] arr = new int[] { 1, 2, 3 };
        int[] expected = new int[] { 1, 2, 3 };
        assertArrayEquals(expected, arr);
    }

    @Test
    public void shouldAssertIterableEquals() {
        Iterable<Integer> arrayList = new ArrayList<>(asList(1, 2, 3));
        Iterable<Integer> expected = new LinkedList<>(asList(1, 2, 3));
        assertIterableEquals(expected, arrayList);
    }

    @Test
    public void shouldAssertNotEquals​() {
        double unexpected = 0.0;
        assertNotEquals(unexpected, 1.0);
    }

    @Test
    public void shouldAssertNotNull​() {
        String notDefinedString = "hello";
        // notDefinedString = null;
        assertNotNull(notDefinedString);
    }

    @Test
    public void shouldAssertNotSame() {
        String hello = "hello";
        String hello2 = "hello2";
        assertNotSame(hello, hello2);
    }

    @Test
    public void shouldAssertSame() {
        String hello = "hello";
        String hello_again = "hello";
        assertSame(hello, hello_again);
    }

    @Test
    public void shouldFail() {
        ExampleApp app = new ExampleApp();
        try {
            app.failingMethod();
            fail("this should not happen");
        } catch (Exception e) {

        }
    }

}
