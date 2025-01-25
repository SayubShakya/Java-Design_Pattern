package Observer;

public class SubscriberImpl implements Subscriber {
    private String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notified(String videoTitle) {
        System.out.println(name + " is notified of new video: " + videoTitle);
    }
}
