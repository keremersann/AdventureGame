package classes.concreteClasses.location;

import classes.abstractClasses.BattleLoc;
import classes.abstractClasses.Obstacle;
import classes.concreteClasses.Player;
import classes.concreteClasses.obstacles.Vampire;
import classes.concreteClasses.obstacles.Zombie;

public class Forest extends BattleLoc {

    public Forest(Player player){
        super(5, player, "Forest", new Vampire(), 3);
    }

    @Override
    public void combat() {

    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
