package StudentManagement;
public class StudentManagement {
    Student[] students = new Student[100];

    private int index = 0;

    /** kiểm tra xem hai sinh viên s1 và s2 có cùng lớp hay không.*/
    public static boolean sameGroup(Student s1, Student s2) {
        boolean check = s1.getGroup().equals(s2.getGroup());
        return check;
    }

    /** thêm mới một Student vào mảng.*/
    public void addStudent(Student newStudent) {
        for (int i = 0; i < this.index; i++) {
            if (this.students[i].getInfo().equals(newStudent.getInfo())) {
                return;
            }
        }
        this.students[this.index] = new Student(newStudent);
        this.index++;
    }

    /** in danh sách sinh viên theo lớp tuân theo định dạng co san. */
    public String studentsByGroup() {
        String listStudent = "";
        String[] lists = new String[100];
        lists[0] = this.students[0].getGroup();

        int dem = 1;
        for (int i = 0; i < this.index; i++) {
            for (int j = 0; j < dem; j++) {
                if ((!lists[j].equals(this.students[i].getGroup()))) {
                    if (j == dem - 1) {
                        lists[dem] = this.students[i].getGroup();
                        dem++;
                        break;
                    }
                    continue;
                } else {
                    break;
                }
            }
        }

        for (int j = 0; j < dem; j++) {
            listStudent += lists[j] + "\n";
            for (int i = 0; i < this.index; i++) {
                if (lists[j].equals(this.students[i].getGroup())) {
                    listStudent += students[i].getInfo() + "\n";
                }
            }
        }
        return listStudent;
    }

    /** xóa sinh viên với mã số là id ra khỏi danh sách.*/
    public void removeStudent(String id) {
        for (int i = 0; i < this.index; i++) {
            if (this.students[i].getId().equals(id)) {
                for (int j = i; j < this.index; j++) {
                    this.students[j] = this.students[j + 1];
                }
                this.index--;
            }
        }
    }

    public static void main(String[] args) {
        /*
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        Student d = new Student();

        b.setName("Bang");
        c.setName("gggg");
        c.setGroup("K62CC");
        d.setGroup("K62CD");
        b.setId("111");
        c.setId("222");
        d.setId("333");

        System.out.println(b.getId());

        StudentManagement stm = new StudentManagement();
        stm.addStudent(a);
        stm.addStudent(b);
        stm.addStudent(c);
        stm.addStudent(d);
        stm.removeStudent("333");

        System.out.println(stm.studentsByGroup()); */
    }
}
