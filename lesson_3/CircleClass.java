public class CircleClass{
    public static void main(String[] args){
        circleCalc(1);
    }

    public static void circleCalc(int radie){
        System.out.println("A Circle with the radius of "+radie);
        double area = Math.PI*(radie*radie);
        System.out.println("Has an area of: "+area);
        double circumferance = 2*(Math.PI*radie);
        System.out.println("And a circumferance of: "+circumferance);
    }

}