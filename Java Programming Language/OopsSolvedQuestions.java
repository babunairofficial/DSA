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

        /* 
        Vehicle obj2 = new Vehicle();
        obj2.print();
        */

        //Solved Practice Question 8
        /* 
        System.out.println(Book.count); //static variables can be accessed directly from class.
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
        */

        Test t = new Test();
        t.set_marks(98);
        System.out.println(Test.marks);
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

/* 
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
*/

/* 
class Book{
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}
*/

class Test{
    static int marks;
    void set_marks(int marks) {
        this.marks = marks;
    }
}