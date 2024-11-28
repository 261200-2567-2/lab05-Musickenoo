// Magical Interface สำหรับตัวละครที่ใช้เวทมนตร์
public interface Magical {
    void castSpell(String spell);
    int getManaPool();
    void addSpell(String spell);
    void increaseSpellPower();
    void summonCreature(String creature);
    void printMagicStats();
}
