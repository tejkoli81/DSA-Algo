package OOPS;

public class Access_modifiers {
    public static void main(String[] args) {
        BankAcc acc1=new BankAcc();
        acc1.name="Omkar Yadav";
        acc1.SetPassword("123455");
        System.out.println(acc1.name);
    }
}

class BankAcc{
    public String name;
    private String password;
    protected void SetPassword(String pwd){
        password = pwd;
    }
}
