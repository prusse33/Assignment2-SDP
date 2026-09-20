package factorymethod;

public abstract class FilmCreator {

    public abstract Film createFilm();

    public void playFilm() {
        Film film = createFilm();
        film.play();
    }
}