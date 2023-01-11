package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Some one should document this!
         */
        Manager manager = new Manager();
        Administrator administrator = new Administrator();
        Consultant consultant = new Consultant();

        List<Employee> list = new ArrayList<>();
        list.add(manager);
        list.add(administrator);
        list.add(consultant);

        list.forEach((a) -> {
            a.complaint();
            a.quit();
        });
        /**
         * Checking if all values can be accessed.
         */
        System.out.println("\nAdministrator: ");
        System.out.println(administrator.name());
        System.out.println(administrator.employeeId());
        System.out.println(administrator.areaOfOperation());
        System.out.println(administrator.employmentDate());
        System.out.println(administrator.duties());

        System.out.println(administrator.getDepartment());
        System.out.println(administrator.getSchedule());
        System.out.println(administrator.getSalary());
        System.out.println(administrator.staffSupport());
        System.out.println(administrator.recruiter());
        System.out.println(administrator.purchaseInventory());
        System.out.println(administrator.registerComplaints());

        System.out.println("\nManager: ");
        System.out.println(manager.name());
        System.out.println(manager.employeeId());
        System.out.println(manager.areaOfOperation());
        System.out.println(manager.employmentDate());
        System.out.println(manager.duties());

        System.out.println(manager.getDepartment());
        System.out.println(manager.getSchedule());
        System.out.println(manager.getSalary());
        System.out.println(manager.hire());
        System.out.println(manager.fire());
        System.out.println(manager.salaryDeductions());
        System.out.println(manager.manageStaff());
        System.out.println(manager.registerComplaints());

        System.out.println("\nConsultant: ");
        System.out.println(consultant.name());
        System.out.println(consultant.employeeId());
        System.out.println(consultant.areaOfOperation());
        System.out.println(consultant.employmentDate());
        System.out.println(consultant.duties());

        System.out.println(consultant.getDeadline());
        System.out.println(consultant.getCompany());
        System.out.println(consultant.getDepartment());
        System.out.println(consultant.getDeadline());
        System.out.println(consultant.complain());
        System.out.println(consultant.createInvoice());
    }
}
