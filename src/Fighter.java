// Fighter
public class Fighter extends RPGCharacterBase {
    private int stamina;
    private Equipable weapon; // อาวุธที่ Fighter สวมใส่
    private Equipable armor;  // ชุดเกราะที่ Fighter สวมใส่

    public Fighter(int level) {
        super(level);
        this.stamina = 100 + 5 * level; // ค่าเริ่มต้น stamina
    }

    @Override
    public void useAbility(String ability) {
        if (stamina > 0) {
            System.out.println("Using ability: " + ability + " with stamina: " + stamina);
            stamina -= 10; // ใช้ stamina
        } else {
            System.out.println("Not enough stamina to use " + ability);
        }
    }

    @Override
    public void printStats() {
        super.printStats();
        System.out.println("Stamina: " + stamina);
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
