public class basicSyntax {
    public static void main(String[] args){
        switchStuff("cow");
        switchStuff("pig");
        switchStuff("qwerty");
        circleCalc(1);
        whileBreak(40);
    }
    /* 
    public static void switchStuff(String value){
        switch(value) {
            case "cow":
                System.out.println("The Cow goes Mooo");
                break;
            case "pig":
                System.out.println("The Pig goes Oink");
                break;
            default:
                System.out.println("idk");
                break;
        }
    }

    public static void circleCalc(int radie){
        System.out.println("A Circle with the radius of "+radie);
        double area = Math.PI*(radie*radie);
        System.out.println("Has an area of: "+area);
        double circumferance = 2*(Math.PI*radie);
        System.out.println("And a circumferance of: "+circumferance);
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
    }*/
}
