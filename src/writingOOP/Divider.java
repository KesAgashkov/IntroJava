package writingOOP;

public class Divider extends WritingMaterials{
    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String divideType) {
        this.dividerType = divideType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    String dividerType;
    boolean metal;
    {
        super.setName("Циркулёк");
        super.setColor("Серебристый");
        setDraw(true);
    }
    public Divider() {
        super();
    }

    static final void  draw_circle(){
        System.out.println("Чертим круг");
    }
    @Override
    public void display() {
        System.out.println("This is Divider!");
        super.display();
        System.out.println("Тип линейки: " + dividerType);
        System.out.println(metal ? "Металл?: ДА" : "Металл?: НЕТ");
        System.out.println();
    }
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1)+ ", Тип циркуля: " + getLength()
                + ", " + "Стальной?: " + isMetal() + "}";
    }
    public static void main(String[] args) {
        Divider p = new Divider();
        System.out.println(p.toString());
    }

}

