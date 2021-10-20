package za.ac.cput.client;

import java.util.HashSet;
import java.util.Set;

public class ContactClient {
    private RestClient client = new RestClient();

    public Contact createContact(Contact contact) {
        return client.post("http://localhost:8080/contact/create", contact, Contact.class);
    }

    public Contact readContact(String id) {
        return client.get("http://localhost:8080/contact/read/" + id, Contact.class);
    }

    public Contact updateAddress(Contact contact) {
        return client.post("http://localhost:8080/contact/update", contact, Contact.class);
    }

    public Boolean deleteContact(String id) {
        return client.get("http://localhost:8080/contact/delete/" + id, Boolean.class);
    }

    public Set<Contact> getAllContacts() {
        return client.get("http://localhost:8080/contact/getall", new HashSet<Contact>().getClass());
    }
}

