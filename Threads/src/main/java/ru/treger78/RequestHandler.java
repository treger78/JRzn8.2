package main.java.ru.treger78;

public class RequestHandler implements Runnable {
    private final String name;
    private final FrontSystem frontSystem;
    private final Bank bank;

    public RequestHandler(String name, FrontSystem frontSystem, Bank bank) {
        this.name = name;
        this.frontSystem = frontSystem;
        this.bank = bank;
    }

    @Override
    public synchronized void run() {
        while (true) {
            Request request = frontSystem.getRequest();

            System.out.println(this.name + ": Получена заяка на обработку по клиенту - " + request.getClientTreadName());

            switch (request.getRequestType()) {
                case REPAYMENT: {
                    bank.setBalance(bank.getBalance() + request.getAmount());

                    printMessage(request, true);

                    break;
                }

                case CREDIT: {
                    long balance = bank.getBalance();
                    long amountFromRequest = request.getAmount();

                    if (balance - amountFromRequest >= 0) {
                        bank.setBalance(balance - amountFromRequest);

                        printMessage(request, true);
                    } else {
                        printMessage(request, false);
                    }

                    break;
                }

                default: break;
            }
        }
    }

    public void printMessage(Request request, boolean isSuccessRequest) {
        String status = isSuccessRequest ? "УСПЕШНО ВЫПОЛНЕНА" : "НЕ ВЫПОЛНЕНА";
        System.out.println(
                "Бэк система: " + request +
                        " " + status + ". Получена от " + this.name +
                        (isSuccessRequest ? "" : ". Сумма больше баланса банка.") +
                        " Баланск банка: " + bank.getBalance()
        );
    }
}
