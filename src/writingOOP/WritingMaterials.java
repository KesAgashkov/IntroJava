package writingOOP;

public class WritingMaterials {
    public String toString() {
        return "Метод вызван из " + getClass()+ "\nWritingMaterials{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", draw=" + draw +
                ","+desc + count+'}';
    }

    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;
    public static final String desc = " Количество предметов: ";
    public static int count = 0;
    {
        name = "Какой-то предмет";
        color = "Какого-то цвета";
        price =  100;
        length = 10;
        draw = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public WritingMaterials(){
        count++;
    }

    public WritingMaterials(String name, String color){
        this.name =  name;
        this.color =  color;
        count++;

    }

    public WritingMaterials(String name, int price){
        this.name =  name;
        this.price = price;
        count++;
    }

    public WritingMaterials(int price, double length, boolean draw){
        this.price = price;
        this.length = length;
        this.draw = draw;
        color = "No color";
        name = "No name";
        count++;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw){
        this.name =  name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        count++;
    }

    public void display(){
        System.out.println("Имя: " + name);
        System.out.println("Цвет: " + color);
        System.out.println("Цена: " + price);
        System.out.println("Длина: " + length);
        System.out.println(draw ? "Умеет рисовать: ДА" : "Умеет рисовать: НЕТ");
    }
     public void replace_rod(String change){
        color = change;
     }
     public void priceUp (int up){
        price+=up;
     }
     public void priceDown (int down){
        price-=down;
    }
    public void draw(){
        System.out.println(draw ? name + " провел линию. Ее цвет: " + color : name + " не может ничего рисовать");
        System.out.println();
    }
    public void draw(int n){
        System.out.println(draw ? name + " провел линий: "+ n +".Их цвет: " + color : name + " не может ничего рисовать");
        System.out.println();
    }

    public void draw(String color) {
        System.out.println(draw ? name + " провел линий: 1. Их цвет: " + color : name + " не может ничего рисовать");
        System.out.println();
    }

    public void draw(String color, int n) {
        System.out.println(draw ? name + " провел линий: "+ n +".Их цвет: " + color : name + " не может ничего рисовать");
        System.out.println();
    }

    public static void wiew(){
        System.out.println(desc + count);
    }
    public static void main(String[] args) {
        // task 1

//        WritingOOP.WritingMaterials pen = new WritingOOP.WritingMaterials();
//        pen.name = "ручка";
//        pen.color = "Красный";
//        pen.length = 15.6;
//        pen.price = 145;
//        pen.draw = true;
//        pen.display();
//        pen.draw();
//        pen.priceDown(10);
//        pen.display();
//        pen.priceUp(23);
//        pen.display();
//        pen.replace_rod("Синий");
//        pen.draw();
//
//        WritingOOP.WritingMaterials ruler = new WritingOOP.WritingMaterials();
//        ruler.name = "линейка";
//        ruler.length = 30.0;
//        ruler.price = 25;
//        ruler.draw = false;
//        ruler.display();
//        ruler.draw();
//        ruler.priceUp(13);
//        ruler.display();

        //task 2

//        WritingOOP.WritingMaterials pen = new WritingOOP.WritingMaterials("ручка", "Красный", 145, 15.6, true);
//        pen.display();
//        pen.draw();
//        pen.priceDown(10);
//        pen.display();
//        pen.priceUp(23);
//        pen.display();
//        pen.replace_rod("Синий");
//        pen.draw();
//
//        WritingOOP.WritingMaterials ruler = new WritingOOP.WritingMaterials("линека", 34);
//        ruler.display();
//        ruler.draw();
//
//        WritingOOP.WritingMaterials wm1 = new WritingOOP.WritingMaterials(23, 67.8, false);
//        wm1.display();
//        wm1.draw();
//
//        WritingOOP.WritingMaterials wm2 = new WritingOOP.WritingMaterials("Циркуль", "Зелёный");
//        wm2.draw = true;
//        wm2.display();
//        wm2.draw();

        //task 3

//        WritingOOP.WritingMaterials pen = new WritingOOP.WritingMaterials();
//        pen.setName("ручка");
//        pen.setColor("Красный");
//        pen.setLength(11.6);
//        pen.setPrice(167);
//        pen.setDraw(true);
//        pen.display();
//        pen.draw();
//        pen.priceDown(10);
//        pen.display();
//        pen.priceUp(23);
//        pen.display();
//        pen.replace_rod("Синий");
//        pen.draw();
//        System.out.println(pen.getName());
//        System.out.println(pen.getColor());
//        System.out.println(pen.getLength());
//        System.out.println(pen.getPrice());
//        System.out.println(pen.isDraw());

        //task 4
//        WritingMaterials pen = new WritingMaterials();
//        pen.setName("ручка");
//        pen.setColor("Красный");
//        pen.setLength(11.6);
//        pen.setPrice(167);
//        pen.setDraw(true);
//        pen.draw();
//        pen.draw("Синий");
//        pen.draw("Зелёный", 15);
//        pen.draw(4);
//
//        WritingMaterials ruler = new WritingMaterials("линека", 34);
//        ruler.setDraw(false);
//        pen.draw();
//        ruler.draw("Синий");
//        pen.draw("Зелёный", 15);
//        pen.draw(4);

        //task 5
//        WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
//        wm.display();
//
//        Pen p = new Pen();
//        p.setName("Паркер");
//        p.display();
//        p.setCountColor(2);
//        p.setAuto(false);
//        System.out.println(p.getCountColor());
//        System.out.println(p.isAuto());
//        p.writeMyName();
//
//        Ruler r = new Ruler();
//        r.setName("Линейка");
//        r.display();
//        r.setLength(25);
//        r.setWood(true);
//        System.out.println(r.getLength());
//        System.out.println(r.isWood());
//        r.measure();
//
//        Divider d = new Divider();
//        d.setName("Циркуль");
//        d.display();
//        d.setDividerType("С карандашом");
//        d.setMetal(true);
//        System.out.println(d.getDividerType());
//        System.out.println(d.isMetal());
//        d.draw_circle();

        // six task
        WritingMaterials wm = new WritingMaterials("точилка",120);
        wm.display();
        wm.wiew();
        System.out.println(wm.toString());
//
//        Pen p = new Pen();
//        p.setName("Паркер");
//        p.display();
//        p.setCountColor(2);
//        p.setAuto(false);
//        System.out.println(p.getCountColor());
//        System.out.println(p.isAuto());
//        p.writeMyName();
//
//        Ruler r = new Ruler();
//        r.setName("Линейка");
//        r.display();
//        r.setLength(25);
//        r.setWood(true);
//        System.out.println(r.getLength());
//        System.out.println(r.isWood());
//        r.measure();
//
//        Divider d = new Divider();
//        d.setName("Циркуль");
//        d.display();
//        d.setDividerType("С карандашом");
//        d.setMetal(true);
//        System.out.println(d.getDividerType());
//        System.out.println(d.isMetal());
//        d.draw_circle();

        //seven task

    }
}
