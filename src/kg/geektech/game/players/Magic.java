package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int Plusdamage = 10;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0)
                heroes[i].setDamage(heroes[i].getDamage() + Plusdamage);
        }


    }
}
