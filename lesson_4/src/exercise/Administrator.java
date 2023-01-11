package exercise;

public class Administrator extends EmploymentAgreement {

    private String department = "Department";

    private String schedule = "Schedule";

    private int salary = 5;

    public String getDepartment() {
        return department;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getSalary() {
        return salary;
    }

    public String staffSupport() {
        return "Staff Support";
    }

    public String recruiter() {
        return "recruiter";
    }

    public String purchaseInventory() {
        return "purchase inventory";
    }

    public String registerComplaints() {
        return "register Complaints";
    }

    @Override
    public String duties() {
        return "Administer";
    }
}
