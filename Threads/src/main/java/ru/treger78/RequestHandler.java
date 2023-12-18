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
    public void run() {
        while (true) {
            Request request = frontSystem.getRequest();

            System.out.println(this.name + ": Получена заяка на обработку по клиенту - " + request.getClientTreadName());

            switch (request.getRequestType()) {
                case REPAYMENT: {
                    bank.setBalance(bank.getBalance() + request.getAmount());

                    System.out.println(
                            "Бэк система: " + request +
                                    " УСПЕШНО ВЫПОЛНЕНА. Получена от " + this.name +
                                    ". Баланск банка: " + bank.getBalance()
                    );

                    break;
                }

                case CREDIT: {
                    long balance = bank.getBalance();
                    long amountFromRequest = request.getAmount();

                    if (balance - amountFromRequest >= 0) {
                        bank.setBalance(bank.getBalance() - request.getAmount());

                        System.out.println(
                                "Бэк система: " + request +
                                        " УСПЕШНО ВЫПОЛНЕНА. Получена от " + this.name +
                                        ". Баланск банка: " + bank.getBalance()
                        );
                    } else {
                        System.out.println(
                                "Бэк система: " + request +
                                        " НЕ ВЫПОЛНЕНА. Получена от " + this.name +
                                        ". Сумма больше баланса банка." +
                                        " Баланск банка: " + bank.getBalance()
                        );
                    }

                    break;
                }

                default: break;
            }
        }
    }
}
