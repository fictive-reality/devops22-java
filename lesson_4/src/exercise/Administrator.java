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

    @Override
    public void complain() {
        System.out.println("The coffee sucks");
    }

    @Override
    public void quit() {
        System.out.println("You quit");
    }

    private void support_staff() {
        // Nothing here
    }

    private void recruit() {
        // Nothing here
    }

    private void schedule_planning() {
        // Nothing here
    }

    private void order_office_material() {
        // Nothing here
    }

    private void register_complaints() {
        // Nothing here
    }

}
