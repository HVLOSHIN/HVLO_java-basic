package final1.ex;

public class Member {
    private final String id; //final 키워드 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;       //생성할 때만 받고 이후로는 못바꿈
        this.name = name;
    }
/*
    public void changeData(String id, String name){
        this.id = id;       //바꿀려고 하면 빨간 밑줄 생김
        this.name = name;
    }

 */
    public void print(){
        System.out.println("id : " + id + ", name : " + name);
    }
}
