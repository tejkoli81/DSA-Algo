import java.util.*;

class Contact{
    private int id;
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(int id, String name, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}

public class PhoneBook {

    static ArrayList<Contact> ct=new ArrayList<>();
    public static void deleteContact(String phoneNumber){
        for(Contact c:ct){
            if(c.getPhoneNumber().equalsIgnoreCase(phoneNumber)){
                ct.remove(c);
                System.out.println("Contact deleted");
                
            }
            else{
                System.out.println("Contact not found");
                
            }
            break;
        }

    }

    public static void searchByName(String name){
       for(Contact c:ct){
        if(c.getName().equalsIgnoreCase(name)){
            System.out.println("Name: "+c.getName()+", Phone no:"+c.getPhoneNumber()+", Email: "+c.getEmail());
            
        }
        else{
            System.out.println("No contact found");
        }
       }

    }
    
    public static void addContact(int id,String name,String phoneNumber,String email){
        
        Contact c=new Contact(id, name, email, phoneNumber);
        Boolean exits=false;
        for(int i=0;i<ct.size()-1;i++){
            if(ct.get(i).getPhoneNumber()==phoneNumber){
                exits=true;
                System.out.println("Contact already exists");
            }
        }
        if(!exits){
            ct.add(c);
            System.out.println("Contact added");
        }

    }

    public static void sortContactsByName(){
        Collections.sort(ct, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getName().compareToIgnoreCase(c2.getName());
            }});
            System.out.println("Sorted contacts:");
            for (Contact c : ct) {
                System.out.println("Name: "+c.getName()+", Phone no:"+c.getPhoneNumber()+", Email: "+c.getEmail());
            }
       
    }
    public static void main(String[] args) {
        PhoneBook p=new PhoneBook();
        p.addContact(1,"John", "1234567890", "johna@gmail.com");
        p.addContact(2,"John", "1234367890", "johnc@gmail.com");
        p.addContact(4,"alice", "1234767890", "johnb@gmail.com");
        p.addContact(3,"John", "1234767890", "johnb@gmail.com");
        
        p.searchByName("john");
        p.deleteContact("1234567090");
        p.sortContactsByName();
        
    }
}

