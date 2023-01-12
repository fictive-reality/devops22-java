package exercise;

public class Manager extends Employee {

    private String name;
    private String department;
    private String areaOfOperation;
    private String duties;
    private String complaint;
    private String quit;
    private String schedule;
    private int salary;

    /**
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Employee#setGetName(java.lang.String)
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Employee#getDepartment()
     */
    @Override
    public String getDepartment() {
        return department;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Employee#setDepartment(java.lang.String)
     */
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

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Employee#setAreaOfOperation(java.lang.String)
     */
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
     * @see exercise.Staff#getComplaint()
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

}
