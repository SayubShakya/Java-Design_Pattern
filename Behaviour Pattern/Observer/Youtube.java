package Observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Youtube {
    public static void main(String[] args) {
        SubjectImpl youtubeChannel = new SubjectImpl();

        SubscriberImpl subscriber1 = new SubscriberImpl("Sayub");
        SubscriberImpl subscriber2 = new SubscriberImpl("Ayub");
        SubscriberImpl subscriber3 = new SubscriberImpl("Yub");
        SubscriberImpl subscriber4 = new SubscriberImpl("Ub");
        SubscriberImpl subscriber5 = new SubscriberImpl("B");

        youtubeChannel.subscribe(subscriber1);
        youtubeChannel.subscribe(subscriber2);
        youtubeChannel.subscribe(subscriber3);
        youtubeChannel.subscribe(subscriber4);
        youtubeChannel.subscribe(subscriber5);

        youtubeChannel.newVideoUploaded("Learn Observer");
        System.out.println("-------------------------------------------");
        youtubeChannel.newVideoUploaded("Learn Design Patterns");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Press 1 to upload a new video");
                System.out.println("Press 2 to create a new subscriber");
                System.out.println("Press 3 to exit");
                System.out.println("Press 4 to unsubscribe a subscriber");

                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter Video Title:");
                        String videoTitle = bufferedReader.readLine();
                        youtubeChannel.newVideoUploaded(videoTitle);
                    }
                    case 2 -> {
                        System.out.println("Enter the name of the new Subscriber:");
                        String subscriberName = bufferedReader.readLine();
                        SubscriberImpl newSubscriber = new SubscriberImpl(subscriberName);
                        youtubeChannel.subscribe(newSubscriber);
                    }
                    case 3 -> {
                        System.out.println("Thank you for using this app!");
                        return;
                    }
                    case 4 -> {
                        System.out.println("Enter the name of the Subscriber to unsubscribe:");
                        String subscriberName = bufferedReader.readLine();

                        for (Subscriber subscriber : youtubeChannel.subscribers) {
                            if (((SubscriberImpl) subscriber).getName().equals(subscriberName)) {
                                youtubeChannel.unsubscribe(subscriber);
                                System.out.println(subscriberName + " has been unsubscribed.");
                                break;
                            }
                        }
                    }
                    default -> System.out.println("Invalid input, please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}


