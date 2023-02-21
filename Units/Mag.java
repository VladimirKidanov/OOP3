package Units;
/**
 * Маги
 */
public class Mag extends Unit{
    /**
     * Кол-во маны
     */
    protected int mana;
    /**
     * Магическая книга
     */
    protected boolean magiсBook;

    public Mag(String name) {
        super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
        this.mana = mana;
        this.magiсBook = magiсBook;
    }

    @Override
    public void step() {
        super.step();
    }

    @Override
    public String getInfo() {
        return "Я маг!!!";
    }

    /**
     * Произнести заклинание
     */
    public void custSpell(){
        System.out.println("Кастует заклинание");
    }

}
