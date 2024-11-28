// คลาส Shield สำหรับโล่ใน RPG
public class Shield implements Armor {
    private double defense;
    private double weight;
    private int durability;
    private int mana; // เพิ่มฟิลด์ mana

    public Shield(double defense, double weight, int durability, int mana) {
        this.defense = defense;
        this.weight = weight;
        this.durability = durability;
        this.mana = mana; // กำหนดค่า mana
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public double getWeight() {
        return weight;
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
        return -0.2; // ลดความเร็วในการวิ่ง
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