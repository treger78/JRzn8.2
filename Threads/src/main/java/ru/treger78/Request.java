package main.java.ru.treger78;

public class Request {
    private final String clientTreadName;
    private final long amount;
    private final RequestTypes requestType;

    public Request(String clientTreadName, long amount, RequestTypes requestType) {
        this.clientTreadName = clientTreadName;
        this.amount = amount;
        this.requestType = requestType;
    }

    public long getAmount() {
        return amount;
    }

    public String getClientTreadName() {
        return clientTreadName;
    }

    public RequestTypes getRequestType() {
        return requestType;
    }

    @Override
    public String toString() {
        return "{clientThreadName='" + this.clientTreadName + "', " +
                "amount=" + this.amount + ", " +
                "requestType=" + this.requestType + "}";
    }
}
