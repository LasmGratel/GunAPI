package cc.lasmgratel.gunapi;

/**
 * This class respects a weapon type.
 * 武器种类.
 */
public interface WeaponType {
    /**
     * Get the attack method of this weapon type.
     * 该武器种类使用的攻击方式.
     */
    AttackMethod getAttackMethod();
}
