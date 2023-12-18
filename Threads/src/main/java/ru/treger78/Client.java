package main.java.ru.treger78;

public class Client implements Runnable {
    private final String name;
    private final Request request;
    private final FrontSystem frontSystem;

    public Client(Request request, FrontSystem frontSystem) {
        this.request = request;
        this.frontSystem = frontSystem;
        this.name = this.request.getClientTreadName();
    }

    @Override
    public void run() {
        frontSystem.addRequest(this.request);

        System.out.println(this.name + ": Заявка " + this.request.toString() + " отправлена в банк");
    }
}
