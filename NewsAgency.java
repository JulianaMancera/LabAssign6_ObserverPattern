import java.util.*;

public class NewsAgency implements NewsSubject {

    private List<SubscriberObserver> subscriberList;

    public NewsAgency() {
        this.subscriberList = new ArrayList<>();
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has subscribed.");
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println("\n" + subscriber.getSubscriberName() + " has unsubscribed.");
    }

    @Override
    public void notifying(String news) {
        for (SubscriberObserver subscriber : subscriberList) {
            subscriber.updateNews(news);
        }
    }
}
