package classes.concreteClasses.location;

import classes.concreteClasses.Armor;
import classes.concreteClasses.Weapon;
import classes.abstractClasses.GameChar;
import classes.abstractClasses.Location;
import classes.abstractClasses.NormalLoc;
import classes.concreteClasses.Inventory;
import classes.concreteClasses.Player;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(2, player, "Tool Store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("-------- Welcome to the ToolStore! --------");
        System.out.println("Select your category: ");
        System.out.println("1 - Weapons");
        System.out.println("2 - Armors");
        System.out.println("3 - Exit");
        int itemCategory = Location.scanner.nextInt();
        switch(itemCategory){
            case 1:{
                printWeapons();
                purchaseWeapon();
                break;
            }
            case 2:{
                printArmors();
                purchaseArmor();
                break;
            }
            case 3:
                System.out.println("You have exited Successfully!");
                break;
        }
        super.getPlayer().getGameChar().printGameCharacter();
        return true;
    }

    public void purchaseArmor(){
        int selectedItem = Location.scanner.nextInt();
        while(selectedItem < 1 || selectedItem > Armor.getArmors().length){
            System.out.println("Enter correct number!");
            selectedItem = Location.scanner.nextInt();
        }
        Armor armor = Armor.getArmorById(selectedItem);
        if(armor.getPrice() > this.getPlayer().getGameChar().getMoney()){
            System.out.println("You don't have enough money!");
        }else{
            GameChar currentChar = this.getPlayer().getGameChar();
            Inventory currentInventory = currentChar.getInventory();
            // setting the money
            currentChar.setMoney(currentChar.getMoney() - armor.getPrice());
            // setting the inventory
            currentInventory.setArmor(armor);
        }
    }

    public void printArmors(){
        Armor.printArmors();
    }

    public void printWeapons(){
        Weapon.printWeapons();
    }

    public void purchaseWeapon(){
        int selectedItem = Location.scanner.nextInt();
        while(selectedItem < 1 || selectedItem > Weapon.getWeapons().length){
            System.out.println("Enter correct number!");
            selectedItem = Location.scanner.nextInt();
        }
        Weapon weapon = Weapon.getWeaponById(selectedItem);
        if(weapon.getPrice() > this.getPlayer().getGameChar().getMoney()){
            System.out.println("You don't have enough money!");
        }else{
            GameChar currentChar = this.getPlayer().getGameChar();
            Inventory currentInventory = currentChar.getInventory();
            // setting the money
            currentChar.setMoney(currentChar.getMoney() - weapon.getPrice());
            // setting the inventory
            currentInventory.setWeapon(weapon);
            // printing the infos to the console
            System.out.println("Now You are using: " + currentInventory.getWeapon().getName());
            System.out.println("Your balance: " + currentChar.getMoney());
        }
    }
}
