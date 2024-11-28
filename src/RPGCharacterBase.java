// คลาสตัวละครพื้นฐานที่ใช้ในการอธิบาย RPGCharacter
public class RPGCharacterBase implements RPGCharacter {
    private int level;
    private int hp;
    private int mana;
    private Equipable currentWeapon;
    private Equipable currentArmor;

    public RPGCharacterBase(int level) {
        this.level = level;
        this.hp = 100 + 10 * level;
        this.mana = 50 + 5 * level;
    }

    @Override
    public void levelUp() {
        level++;
        hp = 100 + 10 * level;
        mana = 50 + 5 * level;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void equipItem(Equipable item) {
        if (item instanceof Weapon) {
            this.currentWeapon = item;
        } else if (item instanceof Armor) {
            this.currentArmor = item;
        }
        item.equip();
    }

    @Override
    public void unequipItem(Equipable item) {
        if (item == currentWeapon) {
            currentWeapon = null;
        } else if (item == currentArmor) {
            currentArmor = null;
        }
        item.unequip();
    }

    @Override
    public void normalAttack() {
        if (currentWeapon != null) {
            System.out.println("Normal attack with " + currentWeapon);
        } else {
            System.out.println("No weapon equipped.");
        }
    }

    @Override
    public void block() {
        if (currentArmor != null) {
            System.out.println("Blocking with " + currentArmor);
        } else {
            System.out.println("No armor equipped.");
        }
    }

    @Override
    public void useAbility(String ability) {
        System.out.println("Using ability: " + ability);
    }

    @Override
    public void printStats() {
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
        System.out.println("Mana: " + mana);
    }
}
