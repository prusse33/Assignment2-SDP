package abstractfactory;

public class ActionFilmFactory implements FilmFactory {

    @Override
    public Film createFilm() {
        return new ActionFilm();
    }

    @Override
    public Poster createPoster() {
        return new ActionPoster();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new ActionSoundtrack();
    }
}
