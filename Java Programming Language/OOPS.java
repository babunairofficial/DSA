public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(5);
        // System.out.println(p1.tip);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.userName = "govind";
        myAcc.setPassword("abcdefg");
    }
}

class BankAccount {
    public String userName;
    private String password;
    public void setPassword(String pswd) {
        password = pswd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
