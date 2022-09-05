package ru.javalang.item01simple;

public class MessageProvider implements MessageProviderIf{

    private String s;

    @Override
    public String getMessage() {
        return s;
    }

    @Override
    public void setMessage(String s) {
        this.s = s;
    }
}
