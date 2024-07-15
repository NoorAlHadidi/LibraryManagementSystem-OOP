import java.util.ArrayList;

public class CustomerService implements CustomerInterface{
    private ArrayList<Customer> customers = new ArrayList<>();
    @Override
    public Customer findCustomer(String fName, String lName) {
        for (Customer tempCustomer : customers) {
            if ((tempCustomer.getFirstName()).equals(fName) && (tempCustomer.getLastName()).equals(lName)) {
                return tempCustomer;
            }
        }
        return null;
    }
    @Override
    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }
    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
}
