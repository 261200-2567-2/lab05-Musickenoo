// Class Mage
public class Mage extends RPGCharacterBase implements Magical {
    private int manaPool;
    private double baseSpeed;
    private double totalDamage;
    private double totalDefense;
    private double runSpeedModifier;
    private Weapon weapon;
    private Armor armor;

    public Mage(int level) {
        super(level);
        this.manaPool = 100 + 10 * level;
        this.totalDamage = 0;
        this.totalDefense = 0;
        this.baseSpeed = 1.0;
        this.runSpeedModifier = baseSpeed;
    }

    @Override
    public void useAbility(String ability) {
        if (manaPool > 0) {
            System.out.println("Casting " + ability + " with mana: " + manaPool);
            manaPool -= 10;
        } else {
            System.out.println("Not enough mana to cast " + ability);
        }
    }

    @Override
    public void printStats() {
        super.printStats();
        System.out.println("Mana Pool: " + manaPool);
        System.out.println("Total Damage: " + totalDamage);
        System.out.println("Total Defense: " + totalDefense);
        System.out.println("Run Speed Modifier: " + runSpeedModifier);
    }

    @Override
    public void castSpell(String spell) {
        System.out.println("Casting spell: " + spell);
    }

    @Override
    public int getManaPool() {
        return manaPool;
    }

    @Override
    public void addSpell(String spell) {
        System.out.println("Adding spell: " + spell);
    }

    @Override
    public void increaseSpellPower() {
        System.out.println("Increasing spell power");
    }

    @Override
    public void summonCreature(String creature) {
        System.out.println("Summoning creature: " + creature);
    }

    @Override
    public void printMagicStats() {
        System.out.println("Mana pool: " + manaPool);
        System.out.println("Run Speed Modifier: " + runSpeedModifier);
        if (weapon != null) {
            System.out.println("Weapon: " + weapon.getClass().getSimpleName());
        }
        if (armor != null) {
            System.out.println("Armor: " + armor.getClass().getSimpleName());
        }
    }

    public void equipWeapon(Weapon weapon) {
        if (this.weapon != null) unequipWeapon();
        this.weapon = weapon;
        this.runSpeedModifier += weapon.getRunSpeedModifier();
        this.totalDamage += weapon.getDamage();
        weapon.equip();
    }


    public void unequipWeapon() {
        if (weapon != null) {
            this.runSpeedModifier -= weapon.getRunSpeedModifier();
            this.totalDamage -= weapon.getDamage();
            System.out.println("Unequipping weapon: " + weapon.getClass().getSimpleName());
            this.weapon = null;
        }
    }


    public void equipArmor(Armor armor) {
        if (this.armor != null) unequipArmor();
        this.armor = armor;
        this.runSpeedModifier += armor.getRunSpeedModifier();
        this.totalDefense += armor.getDefense(); // เพิ่มการป้องกันจากเกราะ
        armor.equip();
    }


    public void unequipArmor() {
        if (armor != null) {
            this.runSpeedModifier -= armor.getRunSpeedModifier();
            this.totalDefense -= armor.getDefense(); // ลดการป้องกันจากเกราะ
            System.out.println("Unequipping armor: " + armor.getClass().getSimpleName());
            this.armor = null;
        }
    }
    public void normalAttack(RPGCharacterBase enemy) {
        System.out.println("Mage attacks! Dealing " + totalDamage + " damage.");
        enemy.takeDamage((int) totalDamage);  // ลด HP ของศัตรู
    }
}
