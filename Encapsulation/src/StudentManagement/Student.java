package StudentManagement;
public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    /** Lay ten sv. */
    public String getName() {
        return name;
    }

    /** Dat ten sv. */
    public void setName(String n) {
        this.name = n;
    }

    /** Lay ma sv. */
    public String getId() {
        return id;
    }

    /** Dat ma sv. */
    public void setId(String n) {
        this.id = n;
    }

    /** Lay ten lop. */
    public String getGroup() {
        return group;
    }

    /** Dat ten lop. */
    public void setGroup(String n) {
        this.group = n;
    }

    /** Lay email sv. */
    public String getEmail() {
        return email;
    }

    /** Dat email. */
    public void setEmail(String n) {
        this.email = n;
    }

    /** Khoi tao sv Nguyen Van An, id là 17020001, lớp K62CC, email 17020001@vnu.edu.vn. */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /** In thong tin sv. */
    public String getInfo() {
        String info = this.name + " - " + this.id + " - " + this.group + " - " + this.email;
        return info;
    }

    /** Dat “name”, “id”, và “email” từ tham số, “group” là “K62CB”. */
    public Student(String name, String id, String email) {
        this.group = "K62CB";
        this.name = name;
        this.id = id;
        this.email = email;
    }

    /** Tạo ra sẽ có các thuộc tính với trị giống như của đối tượng s. */
    public Student(Student s) {
        this.email = s.email;
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
    }
}