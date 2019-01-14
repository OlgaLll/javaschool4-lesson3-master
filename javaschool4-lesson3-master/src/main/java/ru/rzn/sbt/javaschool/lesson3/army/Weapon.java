package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Оружие
 */
final public class Weapon {

    /**
     * Тип оружия
     */
    private final WeaponType weaponType;

    /**
     * Урон
     */
    private final int damage;

    /**
     * Стоимость
     */
    private final int cost;

    public Weapon(WeaponType weaponType, int damage, int cost) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.cost = cost;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof Weapon) {} else return false;
        Weapon other = (Weapon) obj;
        if (this.weaponType.equals(other.weaponType)) {
            if (this.damage == other.damage) {
                if (this.cost == other.cost) {return true;}
            }
        }
        return false;
    }
}
