package main.java.ru.treger78;

public class RequestHandler implements Runnable {
    private Request request;
    private FrontSystem frontSystem;

    public RequestHandler(FrontSystem frontSystem) {
        this.frontSystem = frontSystem;
    }

    //TODO
    public void getRequest() {
        while (true) {
            request = this.frontSystem.getRequest();

            if (request.getClientTreadName().length() != 0) {

            }
        }
    }

    //TODO
    @Override
    public void run() {
        //взаимодействие с банком
    }
}
