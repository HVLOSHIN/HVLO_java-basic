package ref;

public class Method2 {
    public static void main(String[] args) {
       Student st1 = createStudent("학생1", 15, 90);
       Student st2 = createStudent("학생2", 16, 80);
        printStudent(st1);
        printStudent(st2);
    }
    static Student createStudent(String name, int age, int grade) {
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.grade = grade;
        return st;      //만들어진 객체를 밖에서 사용할 수 있게 반환해줘야 함.
    }
    static void  printStudent(Student st) {
        System.out.println("이름 : " + st.name + ", 나이 : " + st.age + ", 성적 : " + st.grade ) ;
    }
}
