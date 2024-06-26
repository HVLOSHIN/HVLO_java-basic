package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // BigData 내부의 Data 클래스에도 참조값을 할당

        System.out.println("bigData.count = : " + bigData.count); // 0
        System.out.println("bidData.data : " + bigData.data);     // 참조값이 할당 됨
        System.out.println("bigData.value : " + bigData.data.value); // 0

    }
}
