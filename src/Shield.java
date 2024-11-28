// คลาส Shield
public class Shield implements Armor {
    private double defense;
    private int durability;
    private double runSpeedModifier;
    private int mana;

    public Shield(double defense, double runSpeedModifier, int durability, int mana) {
        this.defense = defense;
        this.durability = durability;
        this.runSpeedModifier = runSpeedModifier;
        this.mana = mana; // กำหนดค่า mana
    }

    @Override
    public double getDefense() {
        return defense;
    }


    @Override
    public int getDurability() {
        return durability;
    }


    @Override
    public void equip() {
        System.out.println("Shield equipped.");
    }

    @Override
    public void unequip() {
        System.out.println("Shield unequipped.");
    }

    @Override
    public double getRunSpeedModifier() {
        return runSpeedModifier;
    }

    // เพิ่มฟังก์ชันเพื่อดึงค่า mana
    public int getMana() {
        return mana;
    }

    // เพิ่มฟังก์ชันในการใช้ mana
    public void useMana(int amount) {
        if (mana >= amount) {
            mana -= amount; // ใช้ mana
            System.out.println("Used " + amount + " mana. Remaining mana: " + mana);
        } else {
            System.out.println("Not enough mana to use special ability.");
        }
    }
}