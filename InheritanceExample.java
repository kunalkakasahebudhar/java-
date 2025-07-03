// Superclass (Parent)
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

// Subclass (Child)
class Student extends Person {
    String college;

    void study() {
        System.out.println(name + " is studying at " + college + ".");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shivraj";
        s1.age = 19;
        s1.college = "csmss college of engineering";

        s1.introduce();  // method from Person
        s1.study();      // method from Student
    }
}
