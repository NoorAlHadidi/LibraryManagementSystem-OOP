public abstract class Human {
    private String firstName;
    private String lastName;
    private int age;
    public Human(String fName, String lName, int num) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = num;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
}

