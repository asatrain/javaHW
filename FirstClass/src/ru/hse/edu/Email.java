package ru.hse.edu;

public class Email {
    private String writer;
    private String addressee;
    private String message;

    public Email(String writer, String addressee, String message) {
        this.writer = writer;
        this.addressee = addressee;
        this.message = message;
    }

    public void showEmail() {
        System.out.println(writer + " wrote to " + addressee + " next message: \"" + message + "\"");
    }
}
