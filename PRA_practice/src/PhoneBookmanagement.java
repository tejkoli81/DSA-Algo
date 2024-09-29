import java.util.*;

class Contact {
    private int contactID;
    private String name;
    private String contactType;
    private Set<Integer> phoneNumbers;

    public Contact(int contactID, String name, String contactType, Set<Integer> phoneNumbers) {
        this.contactID = contactID;
        this.name = name;
        this.contactType = contactType;
        this.phoneNumbers = phoneNumbers;
    }

    public int getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getContactType() {
        return contactType;
    }

    public Set<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }
}

class PhoneBook {
    private String categoryName;
    private int cNum;
    private List<Contact> contactList;

    public PhoneBook(String categoryName, int cNum) {
        this.categoryName = categoryName;
        this.cNum = cNum;
        this.contactList = new ArrayList();
    }

    public void addContact(Contact contact) {
        if (contactList.size() < cNum) {
            contactList.add(contact);
        }
    }
    public String getCategoryName() {
        return categoryName;
    }
    public String getContactByName(String name) {
        List<Contact> foundContacts = new ArrayList();
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                foundContacts.add(contact);
            }
        }
        if (foundContacts.isEmpty()) {
            return "Not Found!";
        } else {
            StringBuilder result = new StringBuilder();
            for (Contact contact : foundContacts) {
                result.append(contact.getContactID()).append("\n")
                      .append(contact.getName()).append("\n")
                      .append(contact.getContactType()).append("\n")
                      .append(contact.getPhoneNumbers()).append("\n");
            }
            return result.toString().trim();
        }
    }

    public String contactsInCategory() {
        Set<String> uniqueContacts = new TreeSet();
        for (Contact contact : contactList) {
            uniqueContacts.add(contact.getName());
        }
        if (uniqueContacts.isEmpty()) {
            return "No contacts Found!";
        } else {
            return String.join(", ", uniqueContacts);
        }
    }
}

public class PhoneBookmanagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read number of contacts
        int numberOfContacts = Integer.parseInt(scanner.nextLine());

        List<Contact> contacts = new ArrayList();
        // Step 2: Read contacts and store them in the list
        for (int i = 0; i < numberOfContacts; i++) {
            int contactID = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine();
            String contactType = scanner.nextLine();
            int numOfPhoneNumbers = Integer.parseInt(scanner.nextLine());
            Set<Integer> phoneNumbers = new HashSet();

            for (int j = 0; j < numOfPhoneNumbers; j++) {
                phoneNumbers.add(Integer.parseInt(scanner.nextLine()));
            }

            Contact contact = new Contact(contactID, name, contactType, phoneNumbers);
            contacts.add(contact);
        }

        // Step 3: Read number of categories
        int numberOfCategories = Integer.parseInt(scanner.nextLine());
        List<PhoneBook> phoneBooks = new ArrayList();

        // Step 4: Add categories and assign contacts
        for (int i = 0; i < numberOfCategories; i++) {
            String categoryName = scanner.nextLine();
            int cNum = Integer.parseInt(scanner.nextLine());
            PhoneBook phoneBook = new PhoneBook(categoryName, cNum);

            // Read number of contacts in this category
            int contactsInCategory = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < contactsInCategory; j++) {
                int contactID = Integer.parseInt(scanner.nextLine());

                // Find the contact by ID and add to the phonebook
                for (Contact contact : contacts) {
                    if (contact.getContactID() == contactID) {
                        phoneBook.addContact(contact);
                    }
                }
            }
            phoneBooks.add(phoneBook);
        }

        // Step 5: Query for contacts
        String searchName = scanner.nextLine();
        for (PhoneBook phoneBook : phoneBooks) {
            String contactDetails = phoneBook.getContactByName(searchName);
            if (!contactDetails.equals("Not Found!")) {
                System.out.println(contactDetails);
            }
        }

        // Step 6: Query for unique contacts in a specific category
        String categoryToSearch = scanner.nextLine();
        boolean categoryFound = false;

        for (PhoneBook phoneBook : phoneBooks) {
            if (phoneBook.getCategoryName().equalsIgnoreCase(categoryToSearch)) {
                categoryFound = true;
                System.out.println(phoneBook.contactsInCategory());
            }
        }

        if (!categoryFound) {
            System.out.println("No such category found!");
        }

        scanner.close();
    }
}
