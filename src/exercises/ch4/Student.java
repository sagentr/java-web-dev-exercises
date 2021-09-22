package exercises.ch4;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Sarah", 1, 1, 4.0);
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    //getters are to access class variables ^
    //setters are to modify the class variables


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return this.studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return this.numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //Instantiate the Student class using yourself as the student.
    //to create a new instance of the class student
    // For the numberOfCredits give yourself 1 for this class and a GPA of 4.0 because you are a Java superstar!
}

