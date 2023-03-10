import java.util.StringJoiner;

public class Bird extends Animal{
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return WinterFly;
    }

    public void setWinterFly(boolean winterFly) {
        WinterFly = winterFly;
    }


    String area;
    boolean WinterFly;


    @Override
    public String toString() {
        return super.toString() + " BirdParametres{" +
                "area='" + area + '\'' +
                ", WinterFly=" + WinterFly +
                "} " ;
    }

    {
        super.setType("Птички");
        super.setName("Птица-синица");
        super.setFly(true);
        Animal.count++;
    }
    public Bird() {
        super();
    }

    public void  chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }

    public void display(){
        System.out.println("I am a bird");
        super.display();
        System.out.println("Ореал обитания: " + getArea());
        System.out.println(isWinterFly() ? "Летает на юга? : да" : "Летает на юга? : нет");
        System.out.println();

    }
    public static void main(String[] args) {
        System.out.println(Animal.STRING_DESC);
        Bird b = new Bird();

    }


}