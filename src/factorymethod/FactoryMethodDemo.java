package factorymethod;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        FilmCreator actionCreator = new ActionFilmCreator();
        actionCreator.playFilm();

        FilmCreator comedyCreator = new ComedyFilmCreator();
        comedyCreator.playFilm();
    }
}