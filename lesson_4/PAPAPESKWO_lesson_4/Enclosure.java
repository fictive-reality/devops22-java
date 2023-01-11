public class Enclosure {
    private Double Size = 300.0;
    public Double getSize() {
        return this.Size;
    }
    private Boolean Dirty = false;
    public Boolean getDirty() {
        return this.Dirty;
    }
    private Double Temp = 29.9;
    public Double getTemp() {
        return this.Temp;
    }
    public void clean() {}
	public void close() {}
	public void open() {}
}