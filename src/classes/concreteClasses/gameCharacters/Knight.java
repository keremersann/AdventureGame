package classes.concreteClasses.gameCharacters;

import classes.abstractClasses.GameChar;
import classes.concreteClasses.Inventory;

public class Knight extends GameChar {
    public Knight() {
        super(2,"Knight", new Inventory(),100,100);
    }
}
