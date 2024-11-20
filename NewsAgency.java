import java.util.*;

public class NewsAgency implements NewsSubject {
    
    private List<Subscriber> subscribers;

    public NewsAgency(){
        this.subscribers = new ArrayList<>();
    }

    //add a subscriber
    @Override
    public void attach(Subscriber subscriber){
        subscribers.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has subscribed.");

    }

    //remove a subscriber
    @Override
    public void detach(Subscriber subscriber){
        subscribers.remove(subscriber);
        System.out.println("\n" + subscriber.getSubscriberName() + " has unsubscribed.");
    }
   
    @Override
    //notifying news
    public void notifying(String news){     
        for (Subscriber subscriber : subscribers){
            subscriber.updateNews(news);
        }
    }
}
