package classes.concreteClasses;

public class Armor {
    private int id;
    private String name;
    private int defence;
    private int price;

    public Armor(int id, String name, int defence, int price) {
        this.id = id;
        this.name = name;
        this.defence = defence;
        this.price = price;
    }

    public static Armor[] getArmors(){
        Armor[] armors = new Armor[] {new Armor(1, "Light", 1, 15),
        new Armor(2, "Normal", 3,25),
        new Armor(3, "Weight", 5,40)};

        return armors;
    }

    public static void printArmors(){
        for (Armor armor: Armor.getArmors()) {
            System.out.println("ID: " + armor.getId() + " Name: " + armor.getName() + " Defence: " + armor.getDefence()
            + " Price: " + armor.getPrice());
        }
    }

    public static Armor getArmorById(int id){
        for (Armor armor: Armor.getArmors()) {
            if(armor.getId() == id)
                return armor;
        }
        return null;
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

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
