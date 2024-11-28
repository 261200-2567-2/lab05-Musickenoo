// คลาส Sword
public class Sword implements Weapon {
    private double damage;
    private double runSpeedModifier;
    private int durability;
    private int mana;

    public Sword(double damage, double runSpeedModifier, int durability, int mana) {
        this.damage = damage;
        this.runSpeedModifier = runSpeedModifier;
        this.durability = durability;
        this.mana = mana;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public double getAttackSpeed() {
        return 1.2;
    }

    @Override
    public void specialAttack() {
        System.out.println("Special attack with sword!");
        useMana(10); // ใช้ mana ในการโจมตีพิเศษ
    }

    @Override
    public double getRunSpeedModifier() {
        return runSpeedModifier;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public void equip() {
        System.out.println("Sword equipped.");
    }

    @Override
    public void unequip() {
        System.out.println("Sword unequipped.");
    }

    // เพิ่มฟังก์ชันเพื่อดึงค่า mana
    public int getMana() {
        return mana;
    }

    // เพิ่มฟังก์ชันในการใช้ mana
    public void useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            System.out.println("Used " + amount + " mana. Remaining mana: " + mana);
        } else {
            System.out.println("Not enough mana to use special attack.");
        }
    }
}