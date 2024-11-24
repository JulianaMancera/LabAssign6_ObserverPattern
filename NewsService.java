
public class NewsService {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Subscriber hyunjin = new Subscriber();
        hyunjin.setSubscriberName("Hyunjin");

        Subscriber bangchan = new Subscriber();
        bangchan.setSubscriberName("Bangchan");

        Subscriber han = new Subscriber();
        han.setSubscriberName("Han");

        agency.attach(hyunjin);
        agency.attach(bangchan);

        System.out.println("\nPublishing Breaking News...");
        agency.notifying("Breaking: SKZ dominATE concert on Nov. 23, 2024!");

        agency.detach(bangchan);
        agency.attach(han);

        System.out.println("\nPublishing Another News...");
        agency.notifying("Breaking: The SKZ dominATE concert starts @7pm");
    }
}
