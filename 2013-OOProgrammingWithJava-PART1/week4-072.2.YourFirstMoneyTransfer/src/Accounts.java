
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account Matt = new Account("Matt's account", 1000);
        Account Mine = new Account("My account", 0);
        Matt.withdrawal(100);
        Mine.deposit(100);
        System.out.println(Matt);
        System.out.println(Mine);
        
    }

}
