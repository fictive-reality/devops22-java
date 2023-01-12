package JavaTpoint.JavaObjectToJSON;

// skapar class AntställningsavtalDetaljer
class AdminDetails {
    // Skapar detaljer Admin
    int salary;
    String department, schedule;

    // Getter and setters for getting and setting properties
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Admin [department = " + department + ",  schedule = " + schedule + ", salary = " + salary
                + "]";
    }

}

// Creating main class Admin
public class Admin {
    // main() method start
    public static void main(String args[]) {

        // Skapar objekt AdminDetails class
        AdminDetails adm = new AdminDetails();
        // Läger in values
        adm.setSalary(25000);
        adm.setDepartment("Software Engineering");
        adm.setSchedule("35 hours a week");

        // Visar AdminDetails
        System.out.println(adm);

    }
}