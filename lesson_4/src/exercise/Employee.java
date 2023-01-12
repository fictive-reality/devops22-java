package exercise;

public abstract class Employee implements Staff {

    /**
     *
     */
    /* */
    private String name;
    private String department;
    private String areaOfOperation;
    private String duties;
    private String complaint;
    private String quit;
    private String getEmploymentDate;
    private String getEmployeeId;

    /**
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see exercise.Staff#getDepartment()
     */
    @Override
    public String getDepartment() {
        return this.department;
    }

    /**
     * @param department
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
        return this.areaOfOperation;
    }

    /**
     * @param areaOfOperation
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
        return this.duties;
    }

    /**
     * @param duties
     */
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
        return this.complaint;
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
        return this.quit;
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
    public String getEmploymentDate() {
        return this.getEmploymentDate;
    }

    /**
     * @param getEmploymentDate
     */
    public void setEmploymentDate(String getEmploymentDate) {
        this.getEmploymentDate = getEmploymentDate;
    }

    /**
     * @return
     */
    public String getEmployeeId() {
        return this.getEmployeeId;
    }

    /**
     * @param getEmployeeId
     */
    public void setEmployeeId(String getEmployeeId) {
        this.getEmployeeId = getEmployeeId;
    }

}
