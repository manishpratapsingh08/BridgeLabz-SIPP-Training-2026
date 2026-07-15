import java.util.*;

class AddressBookContact implements Comparable<AddressBookContact> {
    String name;
    String phone;
    String email;

    AddressBookContact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Sorting by name
    public int compareTo(AddressBookContact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

class AddressBook {
    ArrayList<AddressBookContact> contacts = new ArrayList<>();
    HashMap<String, AddressBookContact> map = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    // Add contact
    void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed!");
            return;
        }

        AddressBookContact c = new AddressBookContact(name, phone, email);
        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added successfully!");
    }

    // Search contact
    void searchContact(String name) {
        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact not found!");
        }
    }

    // Delete contact
    void deleteContact(String name) {
        if (map.containsKey(name)) {
            AddressBookContact c = map.get(name);
            contacts.remove(c);
            phoneSet.remove(c.phone);
            map.remove(name);

            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    // Display sorted contacts
    void displayContacts() {
        Collections.sort(contacts);

        System.out.println("\nContacts (Sorted by Name):");
        for (AddressBookContact c : contacts) {
            System.out.println(c);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        book.addContact("Manish", "9876543210", "manish@gmail.com");
        book.addContact("Rahul", "9123456780", "rahul@gmail.com");
        book.addContact("Amit", "9988776655", "amit@gmail.com");

        // Duplicate phone
        book.addContact("Ravi", "9876543210", "ravi@gmail.com");

        // Search
        book.searchContact("Rahul");

        // Delete
        book.deleteContact("Amit");

        // Display sorted
        book.displayContacts();
    }
}