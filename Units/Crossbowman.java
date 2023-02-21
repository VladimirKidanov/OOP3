package Units;

/**
 * Арбалетчики
 */
public class Crossbowman extends Arreys{
    /**
     *  Концентрация
     */
    protected int concentration;
    /**
     * Держать строй
     */
    protected boolean keepInLine;



    public Crossbowman(String name) {
        super(name, 100, 1, 100, false, 10, 100, 10, 5, 20, 1, 1, 10, 5);
        this.concentration = 0;
        this.keepInLine = false;
    }

    public Crossbowman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int cartriges, int distance, int concentration, boolean keepInLine) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y, cartriges, distance);
        this.concentration = concentration;
        this.keepInLine = keepInLine;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик!";
    }

    /**
     * Выстрел
     */
    public void shoot(){

    }

    /**
     * Нужна помощь
     */

    public void  needHelp(){

    }
}
