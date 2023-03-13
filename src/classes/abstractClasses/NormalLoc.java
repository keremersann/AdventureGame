package classes.abstractClasses;

import classes.concreteClasses.Player;

public abstract class NormalLoc extends Location {

    public NormalLoc(int id, Player player, String name) {
        super(id, player, name);
    }
}
