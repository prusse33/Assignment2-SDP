package abstractfactory;

public class ComedyFilmFactory implements FilmFactory {

    @Override
    public Film createFilm() {
        return new ComedyFilm();
    }

    @Override
    public Poster createPoster() {
        return new ComedyPoster();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new ComedySoundtrack();
    }
}
