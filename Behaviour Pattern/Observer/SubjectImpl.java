package Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
    List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }  

    @Override
    public void newVideoUploaded(String title) {
        for (Subscriber subscriber : this.subscribers) {
            subscriber.notified(title);
        } //all subscribers
    }
}

