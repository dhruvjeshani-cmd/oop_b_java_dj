package week5;

public class Student extends Person {
    private String admnNumber;

    public Student(String name, String email, String admnNumber){     // constructor
        super(name, email);
        this.admnNumber = admnNumber;
    }

    public void attendLecture(){         // instance method
        System.out.println("OOP Class");
    }

    public static void ChangeCourse(){    // static method
        System.out.println("Change Course");
    }
}
