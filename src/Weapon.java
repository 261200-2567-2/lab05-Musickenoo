// Weapon Interface สำหรับอาวุธ
public interface Weapon extends Equipable {
    double getDamage();
    double getAttackSpeed();
    void specialAttack();
}