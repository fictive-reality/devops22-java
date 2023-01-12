package exercise;

public class Administrator extends Employee {

    private String name;
    private String department;
    private String areaOfOperation;
    private String duties;
    private String complaint;
    private String quit;
    private String schedule;
    private int salary;
    private String staffSupport;
    private String recruit;
    private String purchaseInventory;
    private String registerComplaints;

    /**
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Staff#getAreaOfOperation()
     */
    @Override
    public String getAreaOfOperation() {
        return areaOfOperation;
    }

    public void setAreaOfOperation(String areaOfOperation) {
        this.areaOfOperation = areaOfOperation;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Staff#getDuties()
     */
    @Override
    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Employee#getComplaint()
     */
    @Override
    public String getComplaint() {
        return complaint;
    }

    /**
     * @param complaint
     */
    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Staff#getQuit()
     */
    @Override
    public String getQuit() {
        return quit;
    }

    /**
     * @param quit
     */
    public void setQuit(String quit) {
        this.quit = quit;
    }

    /**
     * @return
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * @return
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return
     */
    public String getStaffSupport() {
        return staffSupport;
    }

    /**
     * @param staffSupport
     */
    public void setStaffSupport(String staffSupport) {
        this.staffSupport = staffSupport;
    }

    /**
     * @return
     */
    public String getRecruit() {
        return recruit;
    }

    /**
     * @param recruit
     */
    public void setRecruit(String recruit) {
        this.recruit = recruit;
    }

    /**
     * @return
     */
    public String getPurchaseInventory() {
        return purchaseInventory;
    }

    /**
     * @param purchaseInventory
     */
    public void setPurchaseInventory(String purchaseInventory) {
        this.purchaseInventory = purchaseInventory;
    }

    /**
     * @return
     */
    public String getRegisterComplaints() {
        return registerComplaints;
    }

    /**
     * @param registerComplaints
     */
    public void setRegisterComplaints(String registerComplaints) {
        this.registerComplaints = registerComplaints;
    }
}
