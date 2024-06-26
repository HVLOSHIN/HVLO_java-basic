package ref;

public class Method1_Re {
    public static void main(String[] args) {
     Student st1 = new Student();
     initSt(st1, "학생1",15,90);

     Student st2  = new Student();
     initSt(st2,"학생2", 16, 80);

     printSt(st1);

    }
   static void initSt(Student st, String name, int age, int grade){
        st.name = name;
        st.age = age;
        st.grade = grade;
    }
   static void printSt(Student st){
        System.out.println(st.name + st.age + st.grade);
    }

}
