package exercise;

public class Consultant extends EmploymentAgreement {

    private String deadline = "Deadline";

    private String company = "Company";

    private String department = "department";

    public String getDeadline() {
        return deadline;
    }

    public String getCompany() {
        return company;
    }

    public String getDepartment() {
        return department;
    }

    public String complain() {
        return "complain";
    }

    public String createInvoice() {
        return "create invoice";
    }

    @Override
    public String duties() {
        return "Consultation";
    }
}
