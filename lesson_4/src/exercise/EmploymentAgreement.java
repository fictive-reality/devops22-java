package exercise;

public class EmploymentAgreement implements Employee {

    @Override
    public void complaint() {
        System.out.println("You have complained. ");
    }

    @Override
    public void quit() {
        System.out.println("You have quit. ");
    }

    public String name() {
        return "You have a name. ";
    }

    public String employeeId() {
        return "Employee id ";
    }

    public String areaOfOperation() {
        return "areaOfOperation ";
    }

    public String employmentDate() {
        return "employmentDate ";
    }

    public String duties() {
        return "duties";
    }

}
