package behavioral.mediator;

public class App {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Can");
        User user2 = new UserImpl(mediator, "Eren");
        User user3 = new UserImpl(mediator, "Muharrem");
        User user4 = new UserImpl(mediator, "Rana");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Herkese Selam");

    }
}
