import java.util.*;

public class NewsService {

    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();
        agency.setSubscriberList(new ArrayList<>());

        Subscriber hyunjin = new Subscriber();
        hyunjin.setSubscriberName("Hyunjin");

        Subscriber bangchan = new Subscriber();
        bangchan.setSubscriberName("Bangchan");

        Subscriber han = new Subscriber();
        han.setSubscriberName("Han");

        agency.attach(hyunjin);
        agency.attach(bangchan);

        System.out.println("\nPublishing Breaking News...");
        agency.setNewsTitle("SKZ dominATE concert on Nov. 23, 2024");
        agency.notifying("\nDon't miss it! The most awaited concert is here.\n");

        agency.detach(bangchan);
        agency.attach(han);

        System.out.println("\nPublishing Another News...");
        agency.setNewsTitle("SKZ dominATE concert starts @7pm");
        agency.notifying("\nGet ready for an dominATE night of performances!\n");
    }
}
