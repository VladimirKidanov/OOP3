package Units;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *  Монах
 */
public class Monk extends  Unit{
    /**
     *  Мотивация
     */
    int motivation;
    /**
     * Боевой навык
     */
    int combatSkill;


    public Monk(String name) {
        super(name, 100, 1, 100, false, 20, 100, 10, 10, 20, 1, 5);
        this.motivation = 10;
        this.combatSkill = 10;
    }

    public Monk(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int motivation, int combatSkill) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.motivation = motivation;
        this.combatSkill = combatSkill;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я монах!!! ";
    }

    /**
     * Удар
     */
    public void hit(){

    }
    /**
     * Замотивировать
     */
    public void getMotivation(){

    }


}
