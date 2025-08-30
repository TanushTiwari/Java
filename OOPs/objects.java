package OOPs;

public class objects {
    public static void main(String[] args) {
        Pen p1= new Pen(); // created a pen object p1
        

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
class Student{
    String name;
    int age;
    float percentage;

    void caclPercentage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }
}