public class Lemur implements Animal {
    private String Name = "Lemur";
    public String getName() {
        return this.Name;
    }
    private int Age = 2;
    public int getAge() {
        return this.Age;
    }
    public void Ageing() {
        this.Age++;
    }
    private int Fluffiness = 4;
    public int getFluffiness() {
        return this.Fluffiness;
    }
    public void speaketh() {
        System.out.println("Hakunah Matata");
    }
    public void flipping() {
        System.out.println("*Flips*");
    }
    @Override
    public void eat() {}
	@Override
	public void sleep() {}
	@Override
	public void snuggle() {}
}