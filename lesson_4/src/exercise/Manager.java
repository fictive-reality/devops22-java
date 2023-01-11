package exercise;

public class Manager extends EmploymentAgreement {

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

    public String hire() {
        return "Hire";
    }

    public String fire() {
        return "Fire";

    }

    public String salaryDeductions() {
        return "Salary deductions";

    }

    public String manageStaff() {
        return "Manage staff";

    }

    public String registerComplaints() {
        return "register Complaints";
    }

    @Override
    public String duties() {
        return "Manage";
    }
}
