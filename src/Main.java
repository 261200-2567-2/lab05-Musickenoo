// Main
public class Main {
    public static void main(String[] args) {
        RPGCharacter fighter = new Fighter(3); // สร้าง Fighter ระดับ 3
        RPGCharacter mage = new Mage(2); // สร้าง Mage ระดับ 2

        // สร้างอุปกรณ์
        Weapon sword = new Sword(50, 0.1, 100, 50); // สร้าง Sword พร้อม mana
        Armor shield = new Shield(20, 5, 100, 30);  // สร้าง Shield พร้อม mana

        // ทดสอบการใช้งาน
        System.out.println("Fighter Stats:");
        fighter.printStats();
        fighter.useAbility("Power Strike"); // ใช้ทักษะ Power Strike
        ((Fighter) fighter).equipWeapon(sword); // Fighter สวมใส่อาวุธ
        ((Fighter) fighter).equipArmor(shield); // Fighter สวมใส่ชุดเกราะ
        System.out.println("Sword Mana: " + ((Sword) sword).getMana()); // แสดงค่า mana ของ Sword

        System.out.println("\nMage Stats:");
        mage.printStats();
        mage.useAbility("Fireball"); // ใช้ทักษะ Fireball
        ((Mage) mage).equipWeapon(sword); // Mage สวมใส่อาวุธ
        ((Mage) mage).equipArmor(shield); // Mage สวมใส่ชุดเกราะ
        System.out.println("Shield Mana: " + ((Shield) shield).getMana()); // แสดงค่า mana ของ Shield

        // ทดสอบการใช้ mana
        ((Sword) sword).useMana(10); // ใช้ mana จาก Sword
        ((Shield) shield).useMana(15); // ใช้ mana จาก Shield
    }
}