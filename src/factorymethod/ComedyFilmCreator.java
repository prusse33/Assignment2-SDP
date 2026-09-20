package factorymethod;

public class ComedyFilmCreator extends FilmCreator {

    @Override
    public Film createFilm() {
        return new ComedyFilm();
    }
}