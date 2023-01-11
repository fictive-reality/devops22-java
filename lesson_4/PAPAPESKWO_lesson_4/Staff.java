public class Staff {
    private String Name = "Håkan";
    public String getName() {
        return this.Name;
    }
    private int Age = 42;
    public int getAge() {
        return this.Age;
    }
    private String Profession = "Djurvårdare";
    public String getProfession() {
        return this.Profession;
    }
    private Double Salary = 31450.5;
    public Double getSalary() {
        return this.Salary;
    } 
    public void sell() {}
    public void feed(Animal animal) {}
    public void clean(Enclosure enclosure) {}
    public void jobPay() {}
}
