public class WhileClass {
    public static void main(String[] args){
        whileBreak(40);
    }
    
    public static void whileBreak(int num){
        while(true){
            if(num == 42){
                System.out.println(num+" is my favorite number");
                break;
            }else{
                System.out.println(num+" is not my favorite number, let's see if the next one is");
                num += 1;
                continue;
            }
            
        }
    }
}
