package polymorphism.ex.sender;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String str) {
        System.out.println("이메일 발송 : " + str);
    }
}
