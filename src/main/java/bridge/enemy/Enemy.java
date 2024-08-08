package bridge.enemy;

import bridge.figther.Fighter;

public abstract class Enemy {
    protected int health;
    protected Fighter fighter;

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public Enemy setFighter(Fighter fighter) {
        this.fighter = fighter;
        return this;
    }
}
