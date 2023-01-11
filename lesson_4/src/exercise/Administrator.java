package exercise;

public class Administrator extends EmploymentContract {
    String department, schedule;
    Short salary;

    Administrator(String name, String id, String area_of_operation, String hiring_date, String assignments,
            String department,
            String schedule, Short salary) {
        super(name, id, area_of_operation, hiring_date, assignments);
        this.department = department;
        this.schedule = schedule;
        this.salary = salary;
    }

    public void support_staff() {
        // Nothing here
    }

    public void recruit() {
        // Nothing here
    }

    public void schedule_planning() {
        // Nothing here
    }

    public void order_office_material() {
        // Nothing here
    }

    public void register_complaints() {
        // Nothing here
    }

}
