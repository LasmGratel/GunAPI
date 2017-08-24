package cc.lasmgratel.gunapi;

/**
 * The attack method of a weapon.
 * 武器攻击方式.
 */
public interface AttackMethod {
    /**
     * Get if this weapon is a melee weapon.
     * Usually true if it's a knife.
     * 该武器是否是一个近战武器.
     * 通常情况下刀子返回true.
     */
    boolean isMelee();

    /**
     * The accuracy of this weapon.
     * If target's distance is higher than this number, the bullet will be offset.
     * 该武器的射程.
     * 如果目标离玩家距离超过射程会就会发生偏离.
     */
    int getAccuracy();
}
