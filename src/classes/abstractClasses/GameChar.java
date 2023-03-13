package classes.abstractClasses;

import classes.concreteClasses.Inventory;

public abstract class GameChar {
    private int id;
    private String name;
    private Inventory inventory;
    private int health;
    private int money;

    public GameChar(int id, String name, Inventory inventory, int health, int money) {
        this.id = id;
        this.name = name;
        this.inventory = new Inventory();
        this.health = health;
        this.money = money;
    }

    public void printGameCharacter(){
        System.out.println("Name: " + this.name + " Weapon: "+ this.getInventory().getWeapon().getName() +
                " Damage: " + this.inventory.getWeapon().getDamage() + " Armor: " + this.getInventory().getArmor().getName()
                + " Defence: " + this.inventory.getArmor().getDefence() + " Health: " + this.getHealth() +
                " Money: " + this.money);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
