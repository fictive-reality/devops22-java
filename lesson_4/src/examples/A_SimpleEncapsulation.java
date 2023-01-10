package examples;

public class A_SimpleEncapsulation {
 
    // Others should not be able to modify this value.
    private String firstName = "Olle";
    private String lastName = "Svensson";
    
    // A "getter"
    public String getFullname(){
        return firstName + " " + lastName; 
    }

    // A "setter"
    public void setFullname(String fullName) {
        if (fullName == null || fullName.isEmpty() || fullName.indexOf(" ") <= 0) {
            throw new IllegalArgumentException("Invalid full name "+fullName);
        }
        String[] names = fullName.split(" ", 2);
        firstName = names[0];
        lastName = names[1];
    }
}

class Example {
    public static void main(String[] args) {
        A_SimpleEncapsulation simpleEncapsulation = new A_SimpleEncapsulation();
        System.out.println(simpleEncapsulation.getFullname());
        // firstName is hidden
        // System.out.println(simpleEncapsulation.firstName);

        simpleEncapsulation.setFullname("Ahmed Nilsson");
        System.out.println(simpleEncapsulation.getFullname());
    }
}
