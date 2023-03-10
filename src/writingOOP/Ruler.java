package writingOOP;

public final class Ruler extends WritingMaterials{

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    double length;
    boolean wood;
    {
        super.setName("Линейка");
        super.setColor("Зеленая");
        setDraw(true);
    }

    public Ruler() {
        super();
    }

    void  measure (){
        System.out.println("Сейчас измерим длину");
    }

    @Override
    public void display() {
        System.out.println("This is ruler!");
        super.display();
        System.out.println("Длина линейки: " + getLength());
        System.out.println(wood ? "Деревяная?: ДА" : "Деревяная?: НЕТ");
        System.out.println();
    }
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1)+ ", Длина: " + getLength()
                + ", " + "Деревяная?: " + isWood() + "}";
    }

    public static void main(String[] args) {
        Ruler p = new Ruler();
        System.out.println(p.toString());
    }

}

