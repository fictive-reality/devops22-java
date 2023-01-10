class Lemur implements Animal {
	private String name = "Lemur";
	private int age = 0;
	private int fluffiness = 4;

	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	public int getFluffiness() { return this.fluffiness; }

	public String speak() { return "Hakkunah Matatatatatatata"; }
	public void backflip() {}

	public void eat() {}
	public void sleep() {}
	public void snuggle() {}
}
