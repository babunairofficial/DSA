public class OopsSolvedQuestions {
    public static void main(String[] args) {
        //Solved Practice Question 1
        /* 
        Student s = new Student();
        s.name = "Alpha";
        System.out.println(s.name);
        */

        //Solved Practice Question 2
        Person p = new Person();
        p.name = "peter";
        p.weight = 50;
        System.out.println(p.name);
        System.out.println(p.weight);
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