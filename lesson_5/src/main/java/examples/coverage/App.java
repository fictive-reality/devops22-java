package examples.coverage;

public class App {

    public int add(int x, int y){
        return x + y;
    }

    public int select(int level){
        int result = 0;
        switch (level) {
            case 10:
                result+=10;
            case 9:
                result+=9;
            case 8:
                result+=8;
            case 7:
                result+=7;
            case 6:
                result+=8;
            case 5:
                result+=5;
            case 4:
                result+=4;
            case 3:
                result+=3;
            case 2:
                result+=1;
            case 1:
                result+=1;
                return result;
            default:
                return 0;
        }
    }
    
    public static void main(String[] args) {
    }
    
}
