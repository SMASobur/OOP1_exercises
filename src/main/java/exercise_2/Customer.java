package exercise_2;

public class Customer {

    //Private fields (Encapsulation)
    private String customerId;
    private String name;
    private String email;
    private String phoneNumber;

    //Constructors
    //Constructor with all fields
    public Customer(String customerId, String name, String email, String phoneNumber) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    //consturctor with required fields only
    public Customer(String customerId, String name, String email){
        this(customerId,name,email,null);

    }

    // Default constructor
    public Customer() {
        this.customerId = "Unknown";
        this.name = "Unknown";
        this.email = "Unknown";
        this.phoneNumber = null;
    }


    //Getters and Setters

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        if (customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.email = email.toLowerCase().trim();
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void updateEmail(String newEmail) {
        setEmail(newEmail);
        System.out.println("Email updated for customer " + customerId);
    }

    public void updatePhoneNumber(String newPhoneNumber) {
        setPhoneNumber(newPhoneNumber);
        System.out.println("Phone number updated for customer " + customerId);
    }


    //Methods

    public String getCustomerInfo(){
        return "Customer ID: "+ customerId + ", Customer Name: " + name + ", Email: "+ email +", Phone Number: " + phoneNumber;
    }


}
