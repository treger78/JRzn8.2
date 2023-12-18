package main.java.ru.treger78;

import java.util.ArrayDeque;

public class FrontSystem {
    private final ArrayDeque<Request> requests = new ArrayDeque<>(2);

    public synchronized void addRequest(Request request) {
        while (requests.size() == 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        requests.addLast(request);

        notifyAll();
    }

    public Request getRequest() {
        Request request;

        synchronized (this) {
            while (requests.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            request = requests.pollFirst();

            notifyAll();
        }

        return request;
    }
}
