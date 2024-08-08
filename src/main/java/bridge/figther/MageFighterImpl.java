package bridge.figther;

public class MageFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("Mage attack!!");
    }

    @Override
    public void protect() {
        System.out.println("Mage protect!!");
    }
}
