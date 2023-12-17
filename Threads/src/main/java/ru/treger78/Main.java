package main.java.ru.treger78;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(100_000);
        FrontSystem frontSystem = new FrontSystem();
        RequestHandler requestHandler1 = new RequestHandler(frontSystem);
        RequestHandler requestHandler2 = new RequestHandler(frontSystem);

        Client client1 = new Client("client1", frontSystem);
        Client client2 = new Client("client2", frontSystem);
        Client client3 = new Client("client3", frontSystem);
        Client client4 = new Client("client4", frontSystem);
        Client client5 = new Client("client5", frontSystem);

        Request request1 = client1.createRequest(1000, RequestTypes.REPAYMENT);

        frontSystem.addRequest(request1);

    }
}
