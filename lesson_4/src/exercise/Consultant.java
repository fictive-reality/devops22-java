package exercise;

public class Consultant extends EmploymentContract {
    String deadline, company, department;

    public Consultant(String name, String id, String area_of_operation, String hiring_date, String assignments,
            String deadline, String company, String department) {
        super(name, id, area_of_operation, hiring_date, assignments);
        this.deadline = deadline;
        this.company = company;
        this.department = department;
    }

    @Override
    public void complain() {
        System.out.println("Im tired");
    }

    @Override
    public void quit() {
        System.out.println("Talk to your employer");
    }

    private void generate_invoice() {
        // Nothing here
    }
}
