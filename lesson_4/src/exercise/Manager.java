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

    public void hire() {
        // Nonthing here
    }

    public void fire() {
        // Nothing here
    }

    public void salary_deduction() {
        // Nothing here
    }

    public void lead_staff() {
        // Nothing here
    }

    public void register_complaints() {
        // Nothing here
    }

}
