package main.java.ru.treger78;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(5_000);
        FrontSystem frontSystem = new FrontSystem();
        RequestHandler requestHandler1 = new RequestHandler("handler1", frontSystem, bank);
        RequestHandler requestHandler2 = new RequestHandler("handler2", frontSystem, bank);

        Client client1 = new Client(
                new Request("client1", 10_000, RequestTypes.REPAYMENT),
                frontSystem
        );

        Client client2 = new Client(
                new Request("client2", 15_000, RequestTypes.REPAYMENT),
                frontSystem
        );

        Client client3 = new Client(
                new Request("client3", 20_000, RequestTypes.REPAYMENT),
                frontSystem
        );

        Client client4 = new Client(
                new Request("client4", 5_000, RequestTypes.CREDIT),
                frontSystem
        );

        Client client5 = new Client(
                new Request("client5", 150_000, RequestTypes.CREDIT),
                frontSystem
        );

        Thread requestHandler1Thread = new Thread(requestHandler1);
        Thread requestHandler2Thread = new Thread(requestHandler2);

        Thread client1Thread = new Thread(client1);
        Thread client2Thread = new Thread(client2);
        Thread client3Thread = new Thread(client3);
        Thread client4Thread = new Thread(client4);
        Thread client5Thread = new Thread(client5);

        requestHandler1Thread.start();
        requestHandler2Thread.start();

        client1Thread.start();
        client2Thread.start();
        client3Thread.start();
        client4Thread.start();
        client5Thread.start();
    }
}
