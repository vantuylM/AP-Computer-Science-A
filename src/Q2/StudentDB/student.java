package Q2.StudentDB;

public class student {
    private String myFirstName;
    private String myLastName;
    private int myId;
    private double myGPA;
    public student(String firstname, String lastname, int id, double gpa) {
        myFirstName = firstname;
        myLastName = lastname;
        myId = id;
        myGPA = gpa;
    }
    public String getFirstName() { return myFirstName; }
    public String getLastName() { return myLastName; }
    public int getId() { return myId; }
    public double getGPA() { return myGPA; }
    public void setGPA(double gpa) { myGPA = gpa; }
}
