package cc.lasmgratel.gunapi;

public interface Weapon {
    /**
     * Get ammo clip contains in this weapon.
     */
    AmmoClip getAmmoClip();

    /**
     * Get the type of this weapon.
     */
    WeaponType getType();
}
