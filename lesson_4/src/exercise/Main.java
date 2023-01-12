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

        administrator.setName("Name");

        List<Staff> list = new ArrayList<>();
        list.add(manager);
        list.add(administrator);

        list.forEach((a) -> {
            a.getComplaint();
            a.getQuit();
            a.getName();

        });

        /**
         * Checking if all values can be accessed.
         */

        System.out.println("\nManager: ");

        manager.setName("Name");
        System.out.println(manager.getName());

        manager.setDepartment("Department");
        System.out.println(manager.getDepartment());

        manager.setAreaOfOperation("AreaOfOperation");
        System.out.println(manager.getAreaOfOperation());

        manager.setDuties("Duties");
        System.out.println(manager.getDuties());

        manager.setComplaint("Complaint");
        System.out.println(manager.getComplaint());

        manager.setQuit("quit");
        System.out.println(manager.getQuit());

        manager.setEmploymentDate("GetEmploymentDate");
        System.out.println(manager.getEmploymentDate());

        manager.setEmployeeId("GetEmploymentId");
        System.out.println(manager.getEmployeeId());

        System.out.println("\nAdministrator: ");

        administrator.setName("Name");
        System.out.println(administrator.getName());

        administrator.setDepartment("Department");
        System.out.println(administrator.getDepartment());

        administrator.setAreaOfOperation("AreaOfOperation");
        System.out.println(administrator.getAreaOfOperation());

        administrator.setDuties("Duties");
        System.out.println(administrator.getDuties());

        administrator.setComplaint("Complaint");
        System.out.println(administrator.getComplaint());

        administrator.setQuit("quit");
        System.out.println(administrator.getQuit());

        administrator.setEmploymentDate("GetEmploymentDate");
        System.out.println(administrator.getEmploymentDate());

        administrator.setEmployeeId("GetEmploymentId");
        System.out.println(administrator.getEmployeeId());

        System.out.println("\nConsultant: ");

        consultant.setName("Name");
        System.out.println(consultant.getName());

        consultant.setDepartment("Department");
        System.out.println(consultant.getDepartment());

        consultant.setAreaOfOperation("AreaOfOperation");
        System.out.println(consultant.getAreaOfOperation());

        consultant.setDuties("Duties");
        System.out.println(consultant.getDuties());

        consultant.setComplaint("Complaint");
        System.out.println(consultant.getComplaint());

        consultant.setQuit("quit");
        System.out.println(consultant.getQuit());

    }
}
