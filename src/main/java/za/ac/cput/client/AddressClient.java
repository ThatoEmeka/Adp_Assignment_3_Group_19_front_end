package za.ac.cput.client;

import java.util.HashSet;
import java.util.Set;

public class AddressClient {
    private RestClient client = new RestClient();

    public Address createAddress(Address address) {
        return client.post("http://localhost:8080/Address/create", address, Address.class);
    }

    public Address readAddress(String id) {
        return client.get("http://localhost:8080/Address/read/" + id, Address.class);
    }

    public Address updateAddress(Address address) {
        return client.post("http://localhost:8080/Address/update", address, Address.class);
    }

    public Boolean deleteAddress(String id) {
        return client.get("http://localhost:8080/Address/delete/" + id, Boolean.class);
    }

    public Set<Address> getAllAddresses() {
        return client.get("http://localhost:8080/Address/getall", new HashSet<Address>().getClass());
    }
}