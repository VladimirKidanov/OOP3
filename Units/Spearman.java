package Units;
/**
 * Кпоейщики
 */
public class Spearman extends Unit{
    /**
     * Держать строй
     */
    protected boolean keepInLine;



    public Spearman(String name){
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
        this.keepInLine = false;
    }

    public Spearman(String name, int hp, int levl, int power, boolean step, int speed, int maxHp, int def, int damegeMin, int damegeMax, int x, int y, boolean keepInLine) {
        super(name, hp, levl, power, step, speed, maxHp, def, damegeMin, damegeMax, x, y);
        this.keepInLine = keepInLine;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }

    /**
     * Если нужна помощь
     */
    public void needHelp(){

    }

    /**
     * Захват территории
     */
    public void capture(){

    }

}
