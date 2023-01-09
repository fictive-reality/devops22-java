package examples.mockito;

public class NumberFactory {
    private int number;
    private Worker worker;

    NumberFactory(){
        number = 10;
    }

    public int getNumber() {
        return number;
    }

    public void setWorker(Worker worker){
        this.worker = worker;
    }

    public int doWork(){
        return this.worker.work() + number;
    }

}
