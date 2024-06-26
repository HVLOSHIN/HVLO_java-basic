package polymorphism.ex.sender;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String str) {
        System.out.println("SMS발송 : " + str);
    }
}
