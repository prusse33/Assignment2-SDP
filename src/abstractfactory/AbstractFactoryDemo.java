package abstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        System.out.println("ACTION FAMILY:");

        FilmFactory actionFactory = new ActionFilmFactory();

        Film actionFilm = actionFactory.createFilm();
        Poster actionPoster = actionFactory.createPoster();
        Soundtrack actionSoundtrack = actionFactory.createSoundtrack();

        actionFilm.play();
        actionPoster.display();
        actionSoundtrack.playMusic();


        System.out.println();

        System.out.println("COMEDY FAMILY:");

        FilmFactory comedyFactory = new ComedyFilmFactory();

        Film comedyFilm = comedyFactory.createFilm();
        Poster comedyPoster = comedyFactory.createPoster();
        Soundtrack comedySoundtrack = comedyFactory.createSoundtrack();

        comedyFilm.play();
        comedyPoster.display();
        comedySoundtrack.playMusic();
    }
}
