package ref;

public class NullMain3 {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println("bigData.count = : " + bigData.count); // 0?
        System.out.println("bidData.data : " + bigData.data);     //data라는 클래스의 참조 주소 = null

        System.out.println("bigData.value : " + bigData.data.value); //오류 NullPointerException
    }
}
