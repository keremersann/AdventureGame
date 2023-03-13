package classes.concreteClasses.location;

import classes.abstractClasses.BattleLoc;
import classes.abstractClasses.Obstacle;
import classes.concreteClasses.Player;
import classes.concreteClasses.obstacles.Zombie;

public class Cave extends BattleLoc {
    public Cave(Player player){
        super(4, player, "Cave", new Zombie(), 3);
    }

    @Override
    public void combat() {

    }

    @Override
    public boolean onLocation() {
        return false;
    }
}
