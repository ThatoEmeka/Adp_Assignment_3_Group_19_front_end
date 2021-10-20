package za.ac.cput.client;

public class Test {

    public static void main(String[] args) {
        post();
    }

    public static void get(){
        RestClient client = new RestClient();
        Contact add = client.get("http://localhost:8080/contact/read/AN651s", Contact.class);
        System.out.println(add.toString());
    }

    public static void post() {
        RestClient client = new RestClient();
        Contact contact = new Contact();
        contact.setName("Saued");
        contact.setMobile("7800");
        contact.setEmail("saued@gmail.com");
        Contact add = client.post("http://localhost:8080/contact/create", contact, Contact.class);
        System.out.println(add.toString());
    }
}
