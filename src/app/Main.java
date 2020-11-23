package app;

public class Main {

    public static void main(String[] args) {
        CinemaFacade cinemaFacade = new CinemaFacade();

        cinemaFacade.watchMovie();
        
        cinemaFacade.stopWatchingMovie();
    }
}
