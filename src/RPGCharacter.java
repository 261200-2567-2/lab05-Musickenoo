// RPGCharacter Interface
public interface RPGCharacter {
    void levelUp();
    int getHp();
    int getMana();
    int getLevel();
    double getRunSpeedModifier();
    void equipItem(Equipable item);
    void unequipItem(Equipable item);
    void normalAttack();
    void block();
    void useAbility(String ability);
    void printStats();
}
