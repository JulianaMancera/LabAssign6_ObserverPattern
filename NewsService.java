
public class NewsService {
    
    public static void main(String[] args) {
        
    //the newsAgency
        NewsAgency agency = new NewsAgency();

    //the subscribers
    Subscriber hyunjin = new Subscriber();
    hyunjin.setSubscriberName("Hyunjin");

    Subscriber bangchan = new Subscriber();
    bangchan.setSubscriberName("Bangchan");

    Subscriber han = new Subscriber();
    han.setSubscriberName("Han");

    //add subscribers to the NewsAgency

    agency.attach(hyunjin);
    agency.attach(bangchan);

    //publis breaking news
    System.out.println("\nPublishing Breaking News...");
    agency.notifying("\n\tBreaking: SKZ dominATE concert on Nov. 23, 2024!");

    //update subscriber list: removing Bangchan and add Han

    agency.detach(bangchan);
    agency.attach(han);

    //Publish another news update
    System.out.println("\nPublishing Another News...");
    agency.notifying("\n\tBreaking: The SKZ dominATE concert starts @7pm");

    }
}
