package examples.mockito;

public class SlowWorker implements Worker {

    public int work(){
        // To test this we need to use PowerMock
        try {
            Thread.sleep(9000);
            return 1;
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
    }

    public int conditionalReturn(int value) throws Exception{
        if (value < 10){
            return value;
        }
        throw new Exception("Value greater or equal to 10 is not allowed");
    }

    public int moreWork(int value){
        try {
            return 10 + work() + conditionalReturn(value);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return 0;
        }
    }
    
}
