package main.java.ru.treger78;

import java.util.ArrayDeque;

public class FrontSystem {
    private ArrayDeque<Request> requests = new ArrayDeque<>(2);

    public void addRequest(Request request) {
        synchronized (requests) {
            requests.addLast(request);

            try {
                requests.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Request getRequest() {
        Request request;

        synchronized (requests) {
            request = requests.pollFirst();

            requests.notifyAll();
        }

        return request;
    }
}
