package abstractfactory;

public interface FilmFactory {

    Film createFilm();

    Poster createPoster();

    Soundtrack createSoundtrack();
}