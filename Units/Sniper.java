package Units;

/**
 * Снайпер
 */
public class Sniper extends Arreys{
    /**
     * Маскировка
     */
    protected int disguise;
    /**
     * Концентрация
     */
    protected int concentration;



    public Sniper(String name){
        super(name, 80, 1, 60, false, 40, 80, 5, 50, 80,2, 2, 10, 50);
        this.disguise = 50;
        this.concentration = 10;
    }

    public Sniper(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, int cartriges, int distance, int disguise, int concentration) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y, cartriges, distance);
        this.disguise = disguise;
        this.concentration = concentration;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }

    /**
     * Маскируется
     */
    public void setDisguise(){

    }

    /**
     * Выстел
     */
    public void shot(){

    }

}
