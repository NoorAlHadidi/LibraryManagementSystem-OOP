package Interface;

import Model.Customer;

public interface CustomerInterface {
    public Customer findCustomer(String fName, String lName);
    public void addCustomer(Customer newCustomer);
    public void removeCustomer(Customer customer);
}
