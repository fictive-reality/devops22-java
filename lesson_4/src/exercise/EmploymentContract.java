package exercise;

// super class
public class EmploymentContract implements Employee {
    String name, id, area_of_operation, hiring_date, assignments;

    public EmploymentContract(String name, String id, String area_of_operation, String hiring_date,
            String assignments) {
        this.name = name;
        this.id = id;
        this.area_of_operation = area_of_operation;
        this.hiring_date = hiring_date;
        this.assignments = assignments;

    }

    public void complain() {
        System.out.println("Complaint recieved");
    }

    public void quit() {
        System.out.println("You quit");
    }

}
