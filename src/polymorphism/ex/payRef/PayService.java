package polymorphism.ex.payRef;

public class PayService {
    public void processPay(String option, int amount){
        System.out.println("결제를 시작합니다. option : " + option + ", amount : " + amount);
        int successCount = 0;
        PayMethod payMethod1 = new KakaoPay();
        successCount += payMethod1.pay(option,amount);
        PayMethod payMethod2 = new NaverPay();
        successCount += payMethod2.pay(option,amount);

        if(successCount == 0){
            System.out.println("결제 수단이 없습니다");
            System.out.println("결제가 실패했습니다.");
        }
    }
}
