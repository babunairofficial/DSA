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

        Student s1 = new Student();
        System.out.println(s1);


        System.out.println("First Athlete Object");
        Athletes ath1 = new Athletes("Ram", "100m", 1);
        System.out.println(
            "Name of Athlete: " + ath1.name +
            " Event Participated: " + ath1.event +
            " Position achieved: "+ ath1.result
        );
        //invoke the copy constructor
        Athletes ath2 = new Athletes(ath1);
        ath2.event = "200m";
        System.out.println("Copy Constructor used for Second Object");
        System.out.println(
            "Name of Athlete: " + ath2.name + 
            " Event Participated: " + ath2.event +
            " Position achieved: "+ ath2.result
        );
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

    Student() {
        System.out.println("Constructor is called");
    }
}

class Athletes {
    String name;
    String event;
    int result;

    Athletes(String name, String event, int result) {
        this.name = name;
        this.event = event;
        this.result = result;
    }


    //Copy Constructor
    //shallow copy constructor
    // Athletes(Athletes ath1) {
    //     this.name = ath1.name;
    //     this.result = ath1.result;
    // }

    //deep copy
     Athletes(Athletes ath1) {
        this.name = new String(ath1.name);
        this.event = new String(ath1.event);
        this.result = ath1.result;
    }
}
