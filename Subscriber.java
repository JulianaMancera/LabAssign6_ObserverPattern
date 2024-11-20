
public class Subscriber implements SubscriberObserver{

    private String subscriberName;

    public String getSubscriberName(){
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName){
        this.subscriberName = subscriberName;
    }

    @Override
    public void updateNews(String news){
        System.out.println("Hey "+ subscriberName + ", here's the latest news: " +news);
    }

}
   
