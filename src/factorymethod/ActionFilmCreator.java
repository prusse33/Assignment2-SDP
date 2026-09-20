package factorymethod;

public class ActionFilmCreator extends FilmCreator {

    @Override
    public Film createFilm() {
        return new ActionFilm();
    }
}