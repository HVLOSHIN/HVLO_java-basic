package ref;

public class Method1 {
    public static void main(String[] args) {
        Student st3 = new Student();
        initStudent(st3, "학생1",15,90);
        Student st4 = new Student();
        initStudent(st4, "학생2",16,80);

        printStudent(st3);
        printStudent(st4);
    }
    static void initStudent(Student st, String name, int age, int grade) {
        st.name = name;
        st.age = age;
        st.grade = grade;
    }
    static void  printStudent(Student st) {
        System.out.println("이름 : " + st.name + ", 나이 : " + st.age + ", 성적 : " + st.grade ) ;
    }
}
