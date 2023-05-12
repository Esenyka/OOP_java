package hw5.task02.Core.Mod;

public class Contact {
    public String firstName;
    public String lastName;
    public String description;
    public String phone;
    public String email;

    public Contact(String firstName, String lastName, String description, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName;
    }
}
