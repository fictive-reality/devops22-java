package JonksPanda_solution;

public class Employment_contract implements Employee {

    private String get_employment_date() {
        return "0";
    }

    String name;
    int id;
    String area_of_operation;
    String employment_date = get_employment_date();
    String job_description;
    String department;

    @Override
    public void complain() {

    };

    @Override
    public void resign() {

    };

}
