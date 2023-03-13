package classes.concreteClasses;

import classes.abstractClasses.Location;
import classes.concreteClasses.location.*;

import java.util.Scanner;

public class Game {
    private Scanner scanner;
    private Player player;
    private Location location;

    public Game(){
        this.player = new Player();
        scanner = new Scanner(System.in);
    }

    public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

    public void start(){
        System.out.println("Adventure game is started!");
        System.out.print("Please enter a player name: ");
        //String name = scanner.nextLine();
        this.player.setName("Kerem");
        System.out.println("Welcome to the game " + "Kerem" + "!");
        this.player.selectChar();
        this.player.getGameChar().printGameCharacter();
        boolean gameOpen = true;
        while(gameOpen){
           boolean isSafeZone = selectLoc();
           if(!isSafeZone){
               if(this.player.getGameChar().getHealth() <= 0){
                   System.out.println("You are killed Game Over!");
                   System.out.println("Do you want to restart the game or exit? ");
                   System.out.println("1 - Restart");
                   System.out.println("2 - Exit");
                   int userChoice = scanner.nextInt();
                   switch (userChoice){
                       case 1:{
                           this.player.selectChar();
                           break;
                       }
                       case 2:{
                           gameOpen = false;
                           break;
                       }
                   }
               }else{
                   break;
               }
           }
        }
    }

    public boolean selectLoc(){
        System.out.println("Please Select a Location that you want to teleport!");
        Location[] locations = new Location[] {new SafeHouse(this.player), new ToolStore(this.player)
        , new River(this.player), new Cave(this.player), new Forest(this.player)};
        System.out.println("\n####### Locations #######\n");
        System.out.println("ID: 0 - Quit the game!");
        for (Location loc: locations) {
            System.out.println("ID: " + loc.getId() + " Name: " + loc.getName());
        }

        int id = scanner.nextInt();
        switch(id){
            case 0:{
                System.out.println("You have quitted the game!");
                return false;
            }
            case 1:
                this.location = new SafeHouse(this.player);
                break;
            case 2:
                this.location = new ToolStore(this.player);
                break;
            case 3:
                this.location = new River(this.player);
                break;
            case 4:
                this.location = new Cave(this.player);
                break;
            case 5:
                this.location = new Forest(this.player);
                break;

            default:
                System.out.println("Enter correct Id!");
                break;
        }

        return this.location.onLocation();
    }


    public Player getPlayer() {
        return player;
    }

    public Location getLocation() {
        return location;
    }

}
