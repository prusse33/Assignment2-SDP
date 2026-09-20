package abstractfactory;

public class ActionSoundtrack implements Soundtrack {

    @Override
    public void playMusic() {
        System.out.println("Playing an action film soundtrack.");
    }
}