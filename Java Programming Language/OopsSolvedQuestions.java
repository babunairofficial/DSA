public class OopsSolvedQuestions {
    public static void main(String[] args) {
        //Solved Practice Question 1
        /* 
        Student s = new Student();
        s.name = "Alpha";
        System.out.println(s.name);
        */

        //Solved Practice Question 2
        /* 
        Person p = new Person();
        p.name = "peter";
        p.weight = 50;
        System.out.println(p.name);
        System.out.println(p.weight);
        */

        //Solved Practice Question 5
        /* 
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();
        */

        //Solved Practice Question 6
        /* 
        Vehicle obj1 = new Car();
        obj1.print1(); //Error line
        */

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }    
}
/* 
class Student {
    String name;
    int marks;
}
*/

class Person {
    String name;
    int weight;
}
class Student extends Person{
    int rollNumber;
    String schoolName;
}

//Note : in java, private and protected modifiers are not allowed in front of class. 

/* 
class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class(Car)");
    }
}
*/

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(Car)");
    }
}
