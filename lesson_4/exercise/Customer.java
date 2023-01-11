package exercise;

public class Customer {
    String name, adress, email;
    Long phoneNumber;

    Customer(String name, String adress, String email, Long phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }

    private void setPhoneNumber(Long NewValue) {
        this.phoneNumber = NewValue;
    }

}