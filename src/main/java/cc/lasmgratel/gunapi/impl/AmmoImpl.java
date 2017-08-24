package cc.lasmgratel.gunapi.impl;

import cc.lasmgratel.gunapi.Ammo;

public class AmmoImpl implements Ammo {
    private String identifier;
    private int maxStackSize;
    private int baseDamage;
    private int headDamage;
    private int chestDamange;

    @Override
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public int getMaxStackSize() {
        return maxStackSize;
    }

    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    @Override
    public int getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public int getHeadDamage() {
        return headDamage;
    }

    public void setHeadDamage(int headDamage) {
        this.headDamage = headDamage;
    }

    @Override
    public int getChestDamange() {
        return chestDamange;
    }

    public void setChestDamange(int chestDamange) {
        this.chestDamange = chestDamange;
    }

    public void setDamage(int damage) {
        baseDamage = chestDamange = headDamage = damage;
    }
}
