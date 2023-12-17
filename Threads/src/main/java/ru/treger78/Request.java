package main.java.ru.treger78;

public class Request {
    private String clientTreadName;
    private long amount;
    private Enum requestType;

    public Request(String clientTreadName, long amount, Enum requestType) {
        this.clientTreadName = clientTreadName;
        this.amount = amount;
        this.requestType = requestType;
    }

    public String getClientTreadName() {
        return clientTreadName;
    }

    public long getAmount() {
        return amount;
    }

    public Enum getRequestType() {
        return requestType;
    }
}
