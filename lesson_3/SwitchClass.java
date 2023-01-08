public class SwitchClass {
    public static void main(String[] args){
        switchStuff("cow");
        switchStuff("pig");
        switchStuff("qwerty");
    }
    
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
}
