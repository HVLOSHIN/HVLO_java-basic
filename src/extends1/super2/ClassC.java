package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
         super(1,2 );  //기본생성자는 하나만 정의 가능한데 superClass에서 기본생성자를 이미 정의함
        System.out.println("ClassC 생성자");
    }
}
