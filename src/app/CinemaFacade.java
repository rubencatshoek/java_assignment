package app;

public class CinemaFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public CinemaFacade() {
        this.amp = new Amplifier("Top-O-Line Amplifier");
        this.tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        this.dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        this.cd = new CdPlayer("Top-O-Line CD Player", amp);
        this.projector = new Projector("Top-O-Line Projector", dvd);
        this.lights = new TheaterLights("Theater Ceiling Lights");
        this.screen = new Screen("Theater Screen");
        this.popper = new PopcornPopper("Popcorn Popper");
    }

    public void watchMovie() {
        popper.on();
    }
}