package examples.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumberFactoryTest {
  
    @Test
    public void shouldSetNumberToTen() {
        NumberFactory factory = new NumberFactory();
        assertEquals(10, factory.getNumber());
    }

    @Test
    public void shouldWorkIfWorkerIsSet() throws Exception {
        Worker workerMock = mock(SlowWorker.class);
        NumberFactory factory = new NumberFactory();
        factory.setWorker(workerMock);
        assertEquals(10, factory.doWork());
    }

    @Test
    public void shouldAddWorkerResultToNumber() {
        Worker workerMock = mock(SlowWorker.class);
        when(workerMock.work()).thenReturn(5);

        NumberFactory factory = new NumberFactory();
        factory.setWorker(workerMock);
        assertEquals(15, factory.doWork());
    }

    @Test
    public void shouldFailIfWorkerIsMissing() {
        NumberFactory factory = new NumberFactory();
        assertThrows(NullPointerException.class, () -> {
            factory.doWork();
        });
    }    

}
