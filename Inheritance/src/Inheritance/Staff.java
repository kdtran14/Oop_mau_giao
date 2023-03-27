package Inheritance;

public class Staff extends Person {
    private String school;
    private double pay;

    /** Constructor. */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /** Constructor. */
    public String getSchool() {
        return this.school;
    }

    /** Constructor. */
    public void setSchool(String school) {
        this.school = school;
    }

    /** Constructor. */
    public  double getPay() {
        return this.pay;
    }

    /** Constructor. */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /** Constructor. */
    public String toString() {
        String s = "Staff[" + super.toString() + ",school="
                + getSchool() + ",pay=" + getPay() + "]";
        return s;
    }

//    public static void main(String[] args) {
//        Staff staff = new Staff("Duy", "Hanoi",
//                "UET", 10000.0);
//        System.out.println(staff.toString());
//    }
}
