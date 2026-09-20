package abstractfactory;

public class ComedyPoster implements Poster {

    @Override
    public void display() {
        System.out.println("Displaying a comedy film poster.");
    }
}