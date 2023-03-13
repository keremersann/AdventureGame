package classes.abstractClasses;

import classes.concreteClasses.Player;

public abstract class BattleLoc extends Location {
    protected Obstacle obstacle;
    protected int maxObstacle;

    public BattleLoc(int id, Player player, String name, Obstacle o, int maxObstacle){
        super(id, player, name);
        this.obstacle = o;
        this.maxObstacle = maxObstacle;
    }

    public abstract void combat();

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }
}
