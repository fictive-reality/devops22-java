package JavaTpoint.JavaObjectToJSON;

// skapar class AntställningsavtalDetaljer
class ChefDetails {
    // Skapar detaljer för Chef
    int salary, bonus;
    String department, schedule;

    // Getter and setters for getting and setting properties
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary= salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
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
        return "Chef [department = " + department + ",  schedule = " + schedule + ", salary = " + salary
                + ", bonus = " + bonus + "]";
    }

}

// Creating main class Chef
public class Chef {
    // main() method start
    public static void main(String args[]) {

        // Skapar objekt ChefDetails class
        ChefDetails chf = new ChefDetails();
        // Läger in values
        chf.setSalary(45000);
        chf.setBonus(15000);
        chf.setDepartment("Software Engineering");
        chf.setSchedule("flexible");


        // Visar ChefDetails
        System.out.println(chf);

    }
}