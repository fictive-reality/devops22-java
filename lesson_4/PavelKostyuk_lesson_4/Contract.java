package JavaTpoint.JavaObjectToJSON;


// skapar class AntställningsavtalDetaljer
class ContractDetails {
    // Skapar detaljer för anställningsavtal
    int emp_id, eml_date;
    String name, workplace, job_description;

    // Getter and setters for getting and setting properties
    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public int getEml_date() {
        return eml_date;
    }

    public void setEml_date(int eml_date) {
        this.eml_date = eml_date;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Employee [emp_id = " + emp_id + ",  name = " + name + ", workplace = " + workplace
                + ", eml_date = " + eml_date + ", job_description = " + job_description + "]";
    }

}

// Creating main class Contract
public class Contract {
    // main() method start
    public static void main(String args[]) {

        // Skapar objekt ContractDetails class
        ContractDetails emp = new ContractDetails();
        // Läger in values
        emp.setEmp_id(1);
        emp.setName("Pavel kostyuk");
        emp.setWorkplace("Stockholm");
        emp.setEml_date(20230112);
        emp.setJob_description("DevOps Engineer");


        // Visar ContractDetails
        System.out.println(emp);

    }
}