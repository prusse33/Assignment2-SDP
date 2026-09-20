package factorymethod;

public class ActionFilm implements Film {

    @Override
    public void play() {
        System.out.println("Playing an action film.");
    }
}