package JonksPanda_solution;

public class Consultant extends Employment_contract {
    String deadline;
    String company;

    private int generate_cost(int cost) {
        return cost + 10;
    }

    public void create_bill(int cost) {
        int bill = generate_cost(cost);
    }
}
