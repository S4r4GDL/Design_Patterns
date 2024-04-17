package Singleton;

public class Main {
    public static void main(String[] args) {
        Message message = Message.getMessageInstance();
        Message message2 = Message.getMessageInstance();
        message.setText("Hello world!");
        System.out.println(message.getText());
        System.out.println(message2.getText());
    }
}