package classes.concreteClasses.gameCharacters;

import classes.abstractClasses.GameChar;
import classes.concreteClasses.Inventory;

public class Samurai extends GameChar {
    public Samurai() {
        super(3,"Samurai", new Inventory(),21,15);
    }
}
