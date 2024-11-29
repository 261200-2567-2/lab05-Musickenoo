// Main
public class Main {
    public static void main(String[] args) {
        RPGCharacter fighter = new Fighter(3);
        RPGCharacter mage = new Mage(2);

        Weapon Sticky = new Sword(50, 0.05, 100, 50);
        Weapon Glass = new Sword(10, 0.05, 100, 500);
        Armor Table = new Shield(20, 0.06, 100, 30);

        // Fighter Equip
        System.out.println("\nFighter Stats:");
        fighter.printStats();
        ((Fighter) fighter).equipWeapon(Sticky);
        System.out.println("\nFighter Stats (Equip):");
        fighter.printStats();

        // Mage Equip/Unequip
        System.out.println("\nMage Stats:");
        mage.printStats();
        ((Mage) mage).equipWeapon(Glass);
        ((Mage) mage).equipArmor(Table);
        System.out.println("\nMage Stats (Equip):");
        mage.printStats();
        ((Mage) mage).unequipArmor();


        // Fighter Attacks Mage
        System.out.println("\nFighter attacks Mage:");
        ((Fighter) fighter).normalAttack((RPGCharacterBase) mage);

        // Mage Attacks Fighter
        System.out.println("\nMage attacks Fighter:");
        ((Mage) mage).normalAttack((RPGCharacterBase) fighter);

        // ability
        mage.useAbility("\nFireball");
        mage.printStats();

    }
}