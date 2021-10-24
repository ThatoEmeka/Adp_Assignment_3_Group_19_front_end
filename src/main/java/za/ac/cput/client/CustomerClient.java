package za.ac.cput.client;

import java.util.ArrayList;
import java.util.List;

public class CustomerClient {
    private final RestClient client = new RestClient();

    public Customer createCustomer(Customer customer) {
        return client.post("http://localhost:8090/customer/create", customer, Customer.class);
    }

    public Customer readCustomer(String id) {
        return client.get("http://localhost:8090/customer/read/"+id, Customer.class);
    }

    public Customer updateCustomer(Customer customer) {
        return client.post("http://localhost:8090/customer/update", customer, Customer.class);
    }

    public Boolean deleteCustomer(String id) {
        return client.get("http://localhost:8090/customer/delete/"+id, Boolean.class);
    }

    public List<Customer> getAllCustomers() {
        return client.get("http://localhost:8090/customer/getall", new ArrayList<Customer>().getClass());
    }
}
