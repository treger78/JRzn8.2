package main.java.ru.treger78;

public class Client implements Runnable {
    private final String name;
    private final Request request;
    private final FrontSystem frontSystem;

    public Client(String name, Request request, FrontSystem frontSystem) {
        this.name = name;
        this.request = request;
        this.frontSystem = frontSystem;
    }

    @Override
    public void run() {
        frontSystem.addRequest(this.request);

        System.out.println(this.name + ": Заявка " + this.request + " отправлена в банк");
    }
}
