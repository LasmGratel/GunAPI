package cc.lasmgratel.gunapi;

/**
 * This class respects a ammo clip.
 * 一个弹夹.
 */
public interface AmmoClip {
    /**
     * Get clip's ammo type.
     * 弹夹的弹药种类.
     */
    Ammo getAmmo();

    /**
     * Get the capacity of this clip.
     * For example, MP5 has a 30/120 clip, so the capacity is 150.
     * 弹夹总容量.
     * 例如: MP5拥有一个30/120的弹夹, 总容量就是150.
     */
    int getCapacity();

    /**
     * Get active ammo amount.
     * 活跃弹药数量.
     */
    int getActiveAmmo();

    /**
     * Get inactive ammo amount;
     * 备用弹药数量.
     */
    int getInactiveAmmo();

    /**
     * Refill the inactive ammo into active ammo.
     * 重装弹药.
     */
    void refill();

    /**
     * Take out a ammo.
     * 取出弹药.
     */
    boolean take();

    /**
     * True if this clip is empty.
     * 该弹夹是否为空.
     */
    default boolean isEmpty() {
        return getActiveAmmo() == 0 && getInactiveAmmo() == 0;
    }

}
