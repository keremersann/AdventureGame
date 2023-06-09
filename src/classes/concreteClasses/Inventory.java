package classes.concreteClasses;

public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewood;
    private Weapon weapon;
    private Armor armor;

    public Inventory(){
     this.weapon = new Weapon(0, "Hand", 1, 0);
     this.armor = new Armor(0, "Naked", 1,0);
    }

    public Inventory(boolean water, boolean food, boolean firewood, Weapon weapon, Armor armor) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weapon = weapon;
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
