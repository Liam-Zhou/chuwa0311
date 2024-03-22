import java.util.ArrayList;
import java.util.List;

interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);
}

class NewsPublisher implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}

// Subscriber interface
interface Subscriber {
    void update(String message);
}

// Concrete subscriber
class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received news: " + message);
    }
}

public class PublisherSubscriber {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        newsPublisher.subscribe(subscriber1);
        newsPublisher.subscribe(subscriber2);

        newsPublisher.notifySubscribers("Breaking news: Java is awesome!");

        newsPublisher.unsubscribe(subscriber2);

        newsPublisher.notifySubscribers("Important update: Design patterns are important!");
    }
}