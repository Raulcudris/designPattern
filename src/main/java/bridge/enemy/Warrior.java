package bridge.enemy;

import bridge.figther.Fighter;
import bridge.figther.WarriorFighterImpl;

public class Warrior extends Enemy {

    public Warrior() {
        setFighter( new WarriorFighterImpl());
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }


    public void attack() {
        System.out.println("Warrior: ");
        getFighter().attack();
    }

    public void protect() {
        System.out.println("Warrior: ");
        getFighter().protect();
    }


    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }
}
