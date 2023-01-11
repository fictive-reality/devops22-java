package exercise;

public class Manager extends EmploymentContract {
    String department, schedule;
    Long salary;
    Integer bonus;

    public Manager(String name, String id, String area_of_operation, String hiring_date, String assignments,
            String department, String schedule, Long salary, Integer bonus) {
        super(name, id, area_of_operation, hiring_date, assignments);
        this.department = department;
        this.schedule = schedule;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public void complain() {
        System.out.println("Increase my salary");
    }

    @Override
    public void quit() {
        System.out.println("You cant quit");
    }

    private void hire() {
        // Nonthing here
    }

    private void fire() {
        // Nothing here
    }

    private void salary_deduction() {
        // Nothing here
    }

    private void lead_staff() {
        // Nothing here
    }

    private void register_complaints() {
        // Nothing here
    }

}
