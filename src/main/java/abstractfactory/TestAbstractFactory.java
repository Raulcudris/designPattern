package abstractfactory;

import abstractfactory.armor.Armor;
import abstractfactory.factory.EnemyAbstractFactory;
import abstractfactory.factory.MageFactory;
import abstractfactory.factory.WarriorFactory;
import abstractfactory.weapon.Weapon;
import factory.Enemy;

public class TestAbstractFactory {
    public static void main(String[] args) {

        EnemyAbstractFactory factory = new WarriorFactory();

        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();

        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();

        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardSttaf = factory.createWeapon();

        mage.attack();
        robe.protect();
        wizardSttaf.damage();


    }
}
