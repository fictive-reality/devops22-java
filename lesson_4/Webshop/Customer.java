public class Customer {
    String name, adress, email;
    Long phoneNumber;

    public Customer(String name, String adress, String email, Long phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    private void setPhoneNumber(Long NewValue) {
        this.phoneNumber = NewValue;
    }

    public long getPhoneNumber(Long NewValue) {
        setPhoneNumber(NewValue);
        return this.phoneNumber;
    }

    public String getName() {
        return this.name;
    }
}
