package Singleton;

public class Message{

    private String text = "Hello";

    public static class InstanceMessageHolder{
        public static Message instance = new Message();
    }

    private Message() {
        super();
    }

    public static Message getMessageInstance() {
        return InstanceMessageHolder.instance;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}