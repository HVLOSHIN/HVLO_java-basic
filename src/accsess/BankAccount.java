package accsess;

public class BankAccount {

    private int balance;
    // 현재 보유금액을 private으로 막음
    public BankAccount() {
        balance = 0;
    }
    //입금 메서드 public
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("올바른 금액을 입력해 주세요");
        }
    }
    //검증 메서드 private
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함 (음수를 입금할 순 없으니)
        return amount > 0;
    }
    //출금 메서드 public
    public void withdraw(int amount) {
        if (isAmountValid(amount) && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("올바른 금액을 입력해 주세요");
        }
    }
    // 잔액확인 메서드 public
    public void getBalance() {
        System.out.println("현재 잔액 : " + balance);
    }
}
