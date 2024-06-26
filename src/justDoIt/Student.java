package justDoIt;

public class Student {      //입력창구 / 데이터는 private
    private String name;
    private int score;

    public  Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public void showStudent(){
        System.out.print(name);
        System.out.println(score);
    }

}

