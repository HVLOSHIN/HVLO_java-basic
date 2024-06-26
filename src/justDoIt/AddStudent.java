package justDoIt;

public class AddStudent {           //출력시스템?
    private Student[] st = new Student[10];
    private int count = 0;

    public void addStudent(Student student) {
        st[count] = student;
        count++;
    }

    public void displayStudents() {
        for (int i = 0; i < count; i++) {
            Student student = st[i];
            student.showStudent();
        }
    }
}
