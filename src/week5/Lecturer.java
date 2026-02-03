package week5;

public class Lecturer extends Person {
    private String staffNumber;

    public Lecturer(String name, String email, String staffNumber){     // constructor
        super(name, email);
        this.staffNumber = staffNumber;
    }
    
}
