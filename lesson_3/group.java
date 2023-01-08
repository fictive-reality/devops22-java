public class group {
    public static void main(String[] args){
        int num = 0;
        varargs(10);
        varargs(1,2,3,4);
        varargs();
        do{
            System.out.println(num);
            num += 1;
            test_throw(num);
        }while(num < 10);
        System.out.println("Done");
    }

    public static void test_throw(int num1){
        if(num1 == 99){
            throw new ArithmeticException("The number is equal to 99");
        }
    }

    public static void varargs(int...numIn){
        System.out.println("num of args: "+numIn.length);
        for(int i:numIn){
            System.out.println(i);
        }
    }
}
