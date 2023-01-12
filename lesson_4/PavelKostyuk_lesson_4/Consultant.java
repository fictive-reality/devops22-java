package JavaTpoint.JavaObjectToJSON;

// skapar class ConsultantDetails
class ConsultantDetails {
    // Skapar detaljer Consultant
    int deadline;
    String company, department;

    // Getter and setters for getting and setting properties
    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Consultant [department = " + department + ",  company = " + company + ", deadline = " + deadline
                + "]";
    }

}

// Creating main class Consultant
public class Consultant {
    // main() method start
    public static void main(String args[]) {

        // Skapar objekt ConsultantDetails class
        ConsultantDetails con = new ConsultantDetails();
        // Läger in values
        con.setCompany("IBM");
        con.setDepartment("Software Engineering");
        con.setDeadline(20230215);

        // Visar AdminDetails
        System.out.println(con);

    }
}