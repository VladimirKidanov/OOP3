package Units;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Разбойник
 */
public class Outlaw extends Unit {
    /**
     * Спрятаться
     */

    protected boolean hide;

    public Outlaw(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, boolean hide) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.hide = hide;
    }

    public Outlaw(String name){
        super(name, 50, 1, 20, false, 30, 50, 2, 2, 10, 5, 5);
        this.hide = false;
    }


    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я разбойник!";
    }

    /**
     * Спрятаться
     */
    public void setHide(){

    }
    /**
     * Украсть
     */

    public void steal(){

    }


}
