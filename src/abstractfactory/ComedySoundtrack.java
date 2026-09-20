package abstractfactory;

public class ComedySoundtrack implements Soundtrack {

    @Override
    public void playMusic() {
        System.out.println("Playing a comedy film soundtrack.");
    }
}