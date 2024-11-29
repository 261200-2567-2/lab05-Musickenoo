// Fighter Class
public class Fighter extends RPGCharacterBase {
    private int stamina;
    private double baseSpeed;
    private double runSpeedModifier;
    private double totalDamage;
    private double totalDefense;
    private Weapon weapon;
    private Armor armor;

    public Fighter(int level) {
        super(level);
        this.stamina = 100 + 5 * level;
        this.baseSpeed = 1.0;
        this.runSpeedModifier = baseSpeed;
        this.totalDamage = 0;
        this.totalDefense = 0;
    }

    @Override
    public void printStats() {
        super.printStats();
        System.out.println("Stamina: " + stamina);
        System.out.println("Speed: " + runSpeedModifier);
        System.out.println("Total Damage: " + totalDamage);
        System.out.println("Total Defense: " + totalDefense);
    }

    public void useAbility(String ability) {
        if (stamina >= 20) { // ตัวอย่าง: ใช้พลังงาน 20 หน่วยต่อความสามารถ
            System.out.println("Fighter uses " + ability + "! Stamina: " + stamina);
            stamina -= 20;
        } else {
            System.out.println("Not enough stamina to use " + ability);
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
        this.totalDefense += armor.getDefense();
        armor.equip();
    }

    public void unequipArmor() {
        if (armor != null) {
            this.runSpeedModifier -= armor.getRunSpeedModifier();
            this.totalDefense -= armor.getDefense();
            System.out.println("Unequipping armor: " + armor.getClass().getSimpleName());
            this.armor = null;
        }
    }

    public void normalAttack(RPGCharacterBase enemy) {
        System.out.println("Fighter attacks! Dealing " + totalDamage + " damage.");
        enemy.takeDamage((int) totalDamage);  // ลด HP ของศัตรู
    }

}