package examples.coverage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAddOneAndOne() {
        assertEquals(2, new App().add(1,1));
    }

    @Test
    public void shouldFallThrough(){
        assertEquals(46, new App().select(9));
    }

}
