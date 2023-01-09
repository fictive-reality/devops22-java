package examples.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SlowWorkerTest {

    @Test
    public void shouldSumTenAndWorkResult() throws Exception {
        SlowWorker spy = spy(SlowWorker.class);
        
        doReturn(1).when(spy).work();
        doReturn(1).when(spy).conditionalReturn(1);
       
        assertEquals(12, spy.moreWork(1));
        verify(spy, times(1)).work();
        verify(spy, times(1)).moreWork(1);
        verify(spy, times(1)).conditionalReturn(1);
    }

    @Test
    public void shouldReturnZeroOnConditionalAboveTen() throws Exception {
        SlowWorker spy = spy(SlowWorker.class);
        // SlowWorker.work() is takes 9 seconds to simulate a side effect.
        // Below will stub over that method so it goes quickly and always returns 1
        doReturn(1).when(spy).work();

        assertEquals(0, spy.moreWork(10));
        verify(spy, times(1)).work();
        verify(spy, times(1)).conditionalReturn(10);
    }

    @Test
    public void shouldReturnSumWithZeroOnWorkFailure() {
        SlowWorker spy = spy(SlowWorker.class);
        // SlowWorker.work() is takes 9 seconds to simulate a side effect.
        // Below will stub over that method so it goes quickly and always returns 1
        doReturn(0).when(spy).work();
       
        assertEquals(11, spy.moreWork(1));
        verify(spy, times(1)).work();
        verify(spy, times(1)).moreWork(1);
    }

    @Test
    public void shouldThrowIfConditionalValueIsTen(){
        Exception ex = assertThrows(Exception.class, ()->{
            SlowWorker slow = new SlowWorker();
            slow.conditionalReturn(10);
        });
        assertEquals("Value greater or equal to 10 is not allowed", ex.getMessage());
    }

}
