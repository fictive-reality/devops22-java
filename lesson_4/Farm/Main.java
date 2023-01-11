package Lesson_4.Farm;

public class Main { 
    // testing, no logic at all :D 
    // used implements, extends, private and @override.
    
    public static void main(String[] args) {
        // new instance cow
        Cow newcow = new Cow();
        newcow.makenoice();
        newcow.Awake();
        newcow.Sleep();
        System.out.println(newcow.legs);
        System.out.println(newcow.color);
        newcow.hunger(13);

        //new instance goat
        Goat newgoat = new Goat();
        newgoat.makenoice();
        newgoat.Sleep();
        newgoat.happy(30);
        System.out.println(newgoat.legs);
        System.out.println(newgoat.color);

        // new instance pig 
        Pig newpig = new Pig();
        newpig.makenoice();
        newpig.Noteating();
        System.out.println(newpig.legs);
        // testing private --> System.out.println(newpig.color);
        newpig.testcolor();
        newpig.run(30);


        // new instance farm
        Farm newfarm = new Farm();
        System.out.println(newfarm.locnumber);
        System.out.println(newfarm.location);
        System.out.println(newfarm.name);
        
        // methods from newfarm to print directly.
        newfarm.getname();
        newfarm.getlocationandname();


        
    }
}