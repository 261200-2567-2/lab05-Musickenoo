public class Mage extends RPGCharacterBase implements Magical {
    private int manaPool;
    private String[] spells;
    private Equipable weapon; // อาวุธที่ Mage สวมใส่
    private Equipable armor;  // ชุดเกราะที่ Mage สวมใส่

    public Mage(int level) {
        super(level);
        this.manaPool = 100 + 10 * level; // ค่าเริ่มต้น manaPool
        this.spells = new String[10]; // สามารถเพิ่มคาถาได้สูงสุด 10 คาถา
    }

    @Override
    public void useAbility(String ability) {
        if (manaPool > 0) {
            System.out.println("Casting " + ability + " with mana: " + manaPool);
            manaPool -= 10; // ใช้ mana
        } else {
            System.out.println("Not enough mana to cast " + ability);
        }
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
        // เพิ่มคาถา
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
    }

    // ฟังก์ชันสำหรับการสวมใส่อุปกรณ์
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        weapon.equip();
    }

    public void unequipWeapon() {
        if (weapon != null) {
            weapon.unequip();
            this.weapon = null;
        }
    }

    public void equipArmor(Armor armor) {
        this.armor = armor;
        armor.equip();
    }

    public void unequipArmor() {
        if (armor != null) {
            armor.unequip();
            this.armor = null;
        }
    }
}
