import java.util.*;
public class NewsAgency implements NewsSubject {

    private String newsTitle;
    private String newsContent;
    private List<Subscriber> subscriberList;

    public NewsAgency() {
        this.subscriberList = new ArrayList<>();
    }

    // Getters and Setters for newsTitle and newsContent
    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifying(String news) {
        this.newsContent = news; // Update the news content
        for (Subscriber subscriber : subscriberList) {
            subscriber.updateNews(newsTitle + ": " + newsContent);
        }
    }
}
