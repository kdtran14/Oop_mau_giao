package Inheritance;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;


    /** Constructor. */
    public Student(String name, String address,
                   String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void printf() {
        System.out.println("I'm a student.");
    }

    /** Constructor. */
    public String getProgram() {
        return this.program;
    }

    /** Constructor. */
    public void setProgram(String program) {
        this.program = program;
    }

    /** Constructor. */
    public int getYear() {
        return this.year;
    }

    /** Constructor. */
    public void setYear(int year) {
        this.year = year;
    }

    /** Constructor. */
    public double getFee() {
        return this.fee;
    }

    /** Constructor. */
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        String s = "Student[" + super.toString() + ",program=" + getProgram()
                + ",year=" + getYear() + ",fee=" + getFee() + "]";
        return s;
    }

    public static void main(String[] args) {
        Student student = new Student("Duy", "Hanoi", "Physics", 3, 315);
        System.out.println(student.getAddress());
        student.printf();
    }
}
