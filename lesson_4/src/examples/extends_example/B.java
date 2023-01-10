package examples.extends_example;

class B extends A {

    String name = "B class";

    B() {
        System.out.println("B constructor");
    }

    B(String extra) {
        System.out.println("B constructor with extra: " + extra);
    }

    @Override
    protected String getName() {
        return this.name;
    }

}
