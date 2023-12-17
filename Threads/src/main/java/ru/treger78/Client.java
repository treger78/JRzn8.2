package main.java.ru.treger78;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public Request createRequest(long amount, Enum requestType) {
        return new Request(this.name, amount, requestType);
    }
}
