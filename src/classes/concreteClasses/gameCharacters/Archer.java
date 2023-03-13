package classes.concreteClasses.gameCharacters;

import classes.abstractClasses.GameChar;
import classes.concreteClasses.Inventory;

public class Archer extends GameChar {

    public Archer() {
        super(1,"Archer",new Inventory(),18,20);
    }
}
