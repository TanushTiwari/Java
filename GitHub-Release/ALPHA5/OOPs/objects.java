package OOPs;

public class objects {
    public static void main(String[] args) {

        Pen p1= new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Yellow"; // Directly changing the property of the object
        System.out.println(p1.color);

        BankAccount b1=new BankAccount();
        b1.username="Vikash";
        b1.setPassword("abcd1234");
    }
}
class Pen{
    //Properties
    String color;
    int tip;
    //Functions
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}
class BankAccount{
    public String username;
    private String password;
    int accountNo;
    protected float balance;

    void deposit(float amount){
        balance=balance+amount;
    }
    boolean withdraw(float amount){
        if(balance>=amount){
            balance=balance-amount;
            return true;
        }
        else{
            return false;
        }
    }
    float checkBalance(){
        return balance;
    }
    void setPassword(String newPassword){
        password=newPassword;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void caclPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}

/*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              '
*/