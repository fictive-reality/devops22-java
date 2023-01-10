public class circle {
    double radius;

    public circle(double radius){
        this.radius = radius;
    }

    double circumference(){
        return 2 * Math.PI * this.radius;
    }

    double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public static void main(String[]args){
        circle circle = new circle(5);
        System.out.println("Circumference: " + circle.circumference() + " Area:" + circle.area());
    }
}
