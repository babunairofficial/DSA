//Static keyword
/* 
public class OOPSKeyword {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "BVB";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

*/

//Super Keyword
public class OOPSKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
        
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super.color = "brown";
        System.out.println("horse constructor is called");
    }
}