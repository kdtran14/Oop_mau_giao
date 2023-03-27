package Inheritance;

public class Person {
    private String name;
    private String address;

    /** Constructor. */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printf() {
        System.out.println("I'm a human.");
    }

    /** Constructor. */
    public String getName() {
        return this.name;
    }

    /** Constructor. */
    public String getAddress() {
        return this.address;
    }

    /** Constructor. */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Constructor. */
    public String toString() {
        String s = "Person[name=" + getName() + ",address=" + getAddress() + "]";
        return s;
    }

    public static void main(String[] args) {
        Person p = new Person("Duy", "Hanoi");
        System.out.println(p.toString());
    }
}
