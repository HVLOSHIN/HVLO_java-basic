package polymorphism.ex.payRef;

public class NaverPay implements PayMethod {
    @Override
    public int pay(String option, int amount) {
        if (option.equals("naver")) {
            System.out.println("네이버페이 시스템과 연결합니다.");
            System.out.println(amount + "원 결제를 시도합니다.");
            System.out.println("결제가 성공했습니다.");
            return 1;
        }
        else{
        return 0;
        }
    }
}
