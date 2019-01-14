package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Воин
 */
final public class Warrior {
    /**
     * Оружие
     */
    private Weapon weapon;

    /**
     * Сила
     */
    private final int strength;

    public Warrior(int strength) {
        this(null, strength);
    }

    public Warrior(Weapon weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) {return false;}
        if (obj instanceof Warrior) {} else return false;
        Warrior other = (Warrior) obj;
        if (this.strength == other.strength) {
            if ((this.weapon == null) || (other.weapon == null)) {
                if ((this.weapon == null) && (other.weapon == null)) {return true;}
                return false;
            }
            if (this.weapon.equals(other.weapon)) {return true;}
        }
        return false;
    }
}
