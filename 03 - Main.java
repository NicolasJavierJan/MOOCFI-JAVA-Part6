
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        String sender1 = "Nico";
        String content1 = "This is a simple test";
        
        Message message = new Message(sender1, content1);
        
        MessagingService messaging = new MessagingService();
        
        messaging.add(message);
        System.out.println(messaging.getMessages());
    }
}
