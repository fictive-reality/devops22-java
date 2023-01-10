package examples;

public class A_This {
    private int x,y;

    // A constructor
    public A_This(){
        x = 1;
        y = 2;
    }

    public void setXAndDefaultY(int x){
        // use this to separate method parameter and instance fields
        this.x = x;

        // use this to separate local variables and instance fields
        int y = 0;
        this.y = y;
    }    

    public static void main(String[] args) {
        A_This aThis = new A_This();
        System.out.printf("x=%d, y=%d%n", aThis.x, aThis.y);
        aThis.setXAndDefaultY(5);
        System.out.printf("x=%d, y=%d%n", aThis.x, aThis.y);
    }
}
