package classes.concreteClasses;

import classes.abstractClasses.GameChar;
import classes.concreteClasses.gameCharacters.Archer;
import classes.concreteClasses.gameCharacters.Knight;
import classes.concreteClasses.gameCharacters.Samurai;

import java.util.Scanner;

public class Player {
    private GameChar gameChar;
    private String name;

    public Player(){

    }

    public Player(GameChar gameChar, String name) {
        this.gameChar = gameChar;
        this.name = name;
    }

    public void selectChar(){
        Scanner scanner = new Scanner(System.in);
        GameChar[] gameChars = new GameChar[] {new Archer(), new Knight(), new Samurai()};

        System.out.println("Please select your character: ");
        for (GameChar gc: gameChars) {
            System.out.println("ID: " + gc.getId() + "\t\t" +
                    "Name: " + gc.getName() + "\t\t" +
                    "Damage: " + gc.getInventory().getWeapon().getDamage() + "\t\t" +
                    "Health: " + gc.getHealth() + "\t\t" +
                    "Money: " + gc.getMoney() + "\t\t");
        }
        int id = scanner.nextInt();
        switch(id){
            case 1:
                setGameChar(new Archer());
                break;
            case 2:
                setGameChar(new Knight());
                break;
            case 3:
                setGameChar(new Samurai());
                break;
            default:
                System.out.println("You didn't enter a valid Id!");
                break;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public GameChar getGameChar(){
        return this.gameChar;
    }
    public void setGameChar(GameChar gameChar){
        this.gameChar = gameChar;
    }
}
