package exercise;

public class Consultant implements Staff {
    private String name;
    private String department;
    private String areaOfOperation;
    private String duties;
    private String complaint;
    private String quit;
    private String deadline;
    private String company;

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
    public String getDeadline() {
        return deadline;
    }

    /**
     * @param deadline
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * @return
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

}
