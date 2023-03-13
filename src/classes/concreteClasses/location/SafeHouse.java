package classes.concreteClasses.location;

import classes.abstractClasses.NormalLoc;
import classes.concreteClasses.Player;
import classes.concreteClasses.gameCharacters.Archer;
import classes.concreteClasses.gameCharacters.Knight;
import classes.concreteClasses.gameCharacters.Samurai;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(1, player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the safe zone!");
        System.out.println("You are getting better ..");
        if(this.getPlayer().getGameChar() instanceof Archer){
            this.getPlayer().getGameChar().setHealth(new Archer().getHealth());
        }else if(this.getPlayer().getGameChar() instanceof Knight){
            this.getPlayer().getGameChar().setHealth(new Knight().getHealth());
        }else if(this.getPlayer().getGameChar() instanceof Samurai){
            this.getPlayer().getGameChar().setHealth(new Samurai().getHealth());
        }
        System.out.println("You are now good! your health is: " + this.getPlayer().getGameChar().getHealth());

        return true;
    }
}
