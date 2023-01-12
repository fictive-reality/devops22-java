package excersice.src;

public class Staff {
    public String name;
    private int hunger = 10;
    public String role;
    public int salary;
    public int competensLevel;

    Staff(String name, String role, int salary, int competensLevel) {
        this.name = name;
        // this.hunger = hunger;
        this.salary = salary;
        this.competensLevel = competensLevel;

    }

    public void getStaffInfo() {
        System.out.printf("\nName: %s\nnHunger: %d\nRole: %s\nSalary: %d\nCompetens Level: %d\n", this.name,
                this.hunger, this.role,
                this.salary, this.competensLevel);
    }

    public void work(/* String role */) {
        // if(this.role == "Cleaner"){
        System.out.println("Cleaning-staff is cleaning");
        // Building.Toilethealth++;

        // else if (this.role == "Craftsmen"){
        System.out.println("Repair-man is reparing");
        // Building.heath++;

        // And so on and so on.
    }

}
