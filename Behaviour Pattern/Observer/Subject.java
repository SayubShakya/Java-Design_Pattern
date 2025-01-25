package Observer;

public interface Subject {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void newVideoUploaded(String title);
}
