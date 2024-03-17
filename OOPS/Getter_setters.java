package OOPS;
/*
 *      Getter are used to return the value of private variable 
 *      Setter are  used to set or modify the value of private variable
 * 
 */
public class Getter_setters {
    public static void main(String[] args) {
        bankAcc ac1=new bankAcc();
       ac1.Setname("Vivek");
       ac1.Setusername("vivek123"); 
       ac1.SetPassword("123456789"); 
       
       System.out.println(ac1.getname());
       System.out.println(ac1.getusername());
       System.out.println(ac1.getPassword());
    }
}

class bankAcc{
    protected String name;
    private String username;
    private String password;

    void SetPassword(String password){
        this.password=password;
    }
    void Setname(String name){
        this.name=name;
    }
    void Setusername(String username){
        this.username=username;
    }


    String getPassword(){
    return password;
    }
    String getname(){
    return name;
    }
    String getusername(){
    return username;
    }
}
