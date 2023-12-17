package main.java.ru.treger78;

public class Client implements Runnable {
    private String name;
    private FrontSystem frontSystem;

    public Client(String name, FrontSystem frontSystem) {
        this.name = name;
        this.frontSystem = frontSystem;
    }

    public Request createRequest(long amount, Enum requestType) {
        return new Request(this.name, amount, requestType);
    }

    //TODO
    @Override
    public void run() {
        //взаимодействие с фронт системой
    }
}
