package classes.concreteClasses;

public class Weapon {
    private int id;
    private String name;
    private int damage;
    private int price;

    public Weapon(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapon[] getWeapons(){
        Weapon[] weapons = new Weapon[] {new Weapon(1, "Gun", 2, 5),
                new Weapon(2, "Sword", 3, 35),
                new Weapon(3, "Rifle", 7, 45)};
        return weapons;
    }

    public static Weapon getWeaponById(int id){
        for (Weapon weapon: Weapon.getWeapons()) {
            if(weapon.getId() == id)
                return weapon;
        }
        return null;
    }



    public static void printWeapons(){

        for (Weapon weapon: Weapon.getWeapons()) {
            System.out.println("ID: " + weapon.getId() + "\t\tName: "
            + weapon.getName() + "\t\tDamage: " + weapon.getDamage() + "\t\tPrice: " + weapon.getPrice());
        }
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
