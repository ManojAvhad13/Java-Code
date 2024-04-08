package OOPs;

public class accessSpecifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "manojAvhad";
        System.out.println("User Name: " + myAcc.username);
        myAcc.setPassword("abcdefghi");
        // System.out.println(myAcc.password); // do not access becouse password has
        // private access in BankAccount

    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
