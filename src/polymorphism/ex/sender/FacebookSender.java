package polymorphism.ex.sender;

public class FacebookSender implements Sender {
    @Override
    public void sendMessage(String str) {
        System.out.println("페이스북 발송 : " + str);
    }
}
