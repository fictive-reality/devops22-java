class Enclosure {
	private double size; // in sq ft
	private bool dirty;
	private double temperature;

	public double getSize() { return this.size; }
	public bool getDirty() { return this.dirty; }
	public double getTemperature() { return this.temperature; }

	public void clean() {}
	public void close() {}
	public void open() {}
}
