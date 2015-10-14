/**
 * Created by BennettIronYard on 10/13/15.
 */
public class Contact {
    public String name;
    public String address;
    public String email;
    public int age;

    public Contact() {
    }

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    } // public Contact

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
} // public class
