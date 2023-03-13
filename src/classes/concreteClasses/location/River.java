package classes.concreteClasses.location;

import classes.abstractClasses.BattleLoc;
import classes.abstractClasses.GameChar;
import classes.abstractClasses.Location;
import classes.abstractClasses.Obstacle;
import classes.concreteClasses.Player;
import classes.concreteClasses.obstacles.Bear;

import java.util.Random;

public class River extends BattleLoc {

    public River(Player player){
        super(3, player, "River", new Bear(), 3);
    }

    @Override
    public void combat() {
        Random random = new Random();
        int numberOfObstacles = random.nextInt(1, super.maxObstacle + 1);
        boolean characterHit = random.nextInt(0,  2) == 0;
        System.out.println("There are " + numberOfObstacles + " Obstacles waiting for you!");
        System.out.println("--- Fight is beginning! ---");
        int counter = 0;
        while(true){
            GameChar gameCharacter = this.getPlayer().getGameChar();
            Obstacle obstacle = super.getObstacle();
            if(characterHit){
                int damage = gameCharacter.getInventory().getWeapon().getDamage();
                System.out.println("You hit " + damage + " To the Bear!");
                obstacle.setHealth(obstacle.getHealth() - damage);
                obstacle.printObstacle();

                if(obstacle.getHealth() <= 0){
                    counter++;
                    System.out.println(counter + ". Monster is killed!");
                    System.out.println("You Earned " + obstacle.getMoney());
                    System.out.println("Your balance: " + (gameCharacter.getMoney() + obstacle.getMoney()));
                    gameCharacter.setMoney((gameCharacter.getMoney() + obstacle.getMoney()));
                }

                if(counter == numberOfObstacles)
                    break;

            }
            else{
                int damage = obstacle.getDamage();
                System.out.println("Bear hit " + damage);
                gameCharacter.setHealth(gameCharacter.getHealth() - damage);
                gameCharacter.printGameCharacter();

                if(gameCharacter.getHealth() <= 0)
                    break;

            }
            characterHit = !characterHit;
        }
    }

    @Override
    public boolean onLocation() {
        System.out.println("------ Welcome to the River! ------");
        System.out.println("There are some dangerous obstacles here!, do you want to go back or begin the fight?");
        System.out.println("1 - Fight");
        System.out.println("2 - Go Back");
        int input = Location.scanner.nextInt();
        if(input == 1){
            combat();
        }else{

        }
        return false;
    }
}
