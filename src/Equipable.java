// Equipable Interface สำหรับอุปกรณ์ที่สามารถสวมใส่ได้
public interface Equipable {
    double getRunSpeedModifier();
    int getDurability();
    void equip();
    void unequip();
}
