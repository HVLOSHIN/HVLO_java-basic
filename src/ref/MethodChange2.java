package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();   //data 클래스 변수 선언
        dataA.value = 10;          //okok
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value); //10
        changeReferance(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value); //20

    }
    public static void changeReferance(Data dataX){
        dataX.value = 20;
    }
}
