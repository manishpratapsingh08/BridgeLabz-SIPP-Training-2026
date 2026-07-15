interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Inception", "Interstellar"};
    String[] games = {"FIFA", "Minecraft", "GTA V"};

    public void streamMovie() {
        System.out.println("Available Movies:");
        for (String movie : movies)
            System.out.println(movie);
    }

    public void playGame() {
        System.out.println("Available Games:");
        for (String game : games)
            System.out.println(game);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

class Main {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println();

        tv.streamMovie();

        System.out.println();

        tv.playGame();
    }
}