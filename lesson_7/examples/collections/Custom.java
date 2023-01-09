package lesson_5.examples.collections;

public class Custom implements Comparable<Custom> {
    private String name;

    public Custom(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Custom o) {
        return this.name.compareTo(o.name);
    }

}
