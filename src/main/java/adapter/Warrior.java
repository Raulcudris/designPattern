package adapter;

public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.println("Attack Warrior");
    }

    @Override
    public void damage() {
        System.out.println("Damage Warrior");
    }
}
