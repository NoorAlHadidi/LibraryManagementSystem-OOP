public abstract class Human {
    private String firstName;
    private String lastName;
    public Human(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}

