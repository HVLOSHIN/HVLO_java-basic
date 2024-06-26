package justDoIt;

public class StudentMain {
    public static void main(String[] args) {
        AddStudent addStudent = new AddStudent();

        Student st1 = new Student("만득", 80);
        addStudent.addStudent(st1);
        Student st2 = new Student("영춘", 70);
        addStudent.addStudent(st2);
        Student st3 = new Student("덕배", 60);
        addStudent.addStudent(st3);
       // 입력은 public 이라 자유롭게 가능하지만 , 1번학생의 이름은 private 라 직접 보거나 바꿀 수 없다.
       // st1.showStudent();
        addStudent.displayStudents();
    }
}
