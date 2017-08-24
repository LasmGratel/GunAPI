package cc.lasmgratel.gunapi.impl;

import cc.lasmgratel.gunapi.Ammo;
import cc.lasmgratel.gunapi.AmmoClip;

public class AmmoClipImpl implements AmmoClip {
    private Ammo ammoType;
    private int capacity;
    private int activeAmmo;
    private int inactiveAmmo;

    public AmmoClipImpl setAmmoType(Ammo ammoType) {
        this.ammoType = ammoType;
        return this;
    }

    public AmmoClipImpl setCapacity(int capacity) {
        this.capacity = capacity;
        this.inactiveAmmo = capacity;
        refill();
        return this;
    }

    @Override
    public Ammo getAmmo() {
        return ammoType;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public int getActiveAmmo() {
        return activeAmmo;
    }

    public AmmoClipImpl setActiveAmmo(int activeAmmo) {
        this.activeAmmo = activeAmmo;
        return this;
    }

    @Override
    public int getInactiveAmmo() {
        return inactiveAmmo;
    }

    public AmmoClipImpl setInactiveAmmo(int inactiveAmmo) {
        this.inactiveAmmo = inactiveAmmo;
        return this;
    }

    @Override
    public void refill() {
        final int refillCount = ammoType.getMaxStackSize() - activeAmmo;
        if (inactiveAmmo >= refillCount) {
            activeAmmo = ammoType.getMaxStackSize();
            inactiveAmmo -= refillCount;
        } else {
            activeAmmo += inactiveAmmo;
            inactiveAmmo = 0;
        }
    }

    @Override
    public boolean take() {
        if (activeAmmo > 0) {
            activeAmmo--;
            return true;
        } else return false;
    }
}
