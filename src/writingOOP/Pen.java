package writingOOP;

public class Pen extends WritingMaterials{
    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    int countColor = 1;
    boolean auto;

    {
        super.setName("Ручечка");
        super.setColor("Черная как ночь");
        setDraw(true);
    }
    public Pen() {
        super();
    }
    void  writeMyName (){
        System.out.println("О чудо! Ручка написала моё имя - 'Костя'.");
    }

    @Override
    public void display() {
        System.out.println("This is pen!");
        super.display();
        System.out.println("Количество стержней: " + getCountColor());
        System.out.println(auto ? "Автоматическая?: ДА" : "Автоматическая?: НЕТ");
        System.out.println();
    }
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1)+ ", Количесво стержней: " + getCountColor()
                + ", " + "Автоматическая: " + auto + "}";
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println(p.toString());
    }
}
