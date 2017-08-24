package cc.lasmgratel.gunapi;

/**
 * This class respects a ammo type.
 * 弹药种类.
 */
public interface Ammo {
    /**
     * Identifier of this ammo type.
     * Usually the length of the ammo, like 9mm, 1.5cm, etc.
     * 弹药的标识
     * 一般为弹药的长度, 如9mm, 1.5cm等.
     */
    String getIdentifier();

    /**
     * Max size can this ammo stacks.
     * For example: MP5 uses 9mm ammo, has a 30/120 clip, the max stack size is 30.
     * 该弹药可堆叠的最大数量.
     * 例如: MP5使用9mm弹药, 附带一个30/120的弹夹, 那么最大堆叠数量就是30.
     */
    int getMaxStackSize();

    /**
     * Get base damage can this ammo given.
     * 该弹药可造成的基础伤害.
     */
    int getBaseDamage();

    /**
     * Get the damage when bullet shoots to head (alternative head-shot damage).
     * 该弹药击中头部时可造成的伤害(俗称爆头伤害).
     */
    int getHeadDamage();

    /**
     * Get the damage when bullet shoots to chest.
     * 该弹药击中胸部时可造成的伤害.
     */
    int getChestDamange();
}
