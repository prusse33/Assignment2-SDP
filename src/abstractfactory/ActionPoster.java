package abstractfactory;

public class ActionPoster implements Poster {

    @Override
    public void display() {
        System.out.println("Displaying an action film poster.");
    }
}