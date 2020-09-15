public class Customer {

    static int customerID;
    String name;
    String address;
    String email;
    int phone;


    public int getCustomerID() { return customerID; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public int getPhone() { return phone; }


    public void setCustomerID(int customerID) { this.customerID = customerID; }
    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(int phone) { this.phone = phone; }
}
