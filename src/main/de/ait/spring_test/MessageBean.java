package main.de.ait.spring_test;

public class MessageBean {
    private String message;

    public MessageBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
