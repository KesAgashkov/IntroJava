package abstractTest;

public class House extends Building implements LivingHouse{

    {
        super.name = "Блабла";
        super.adress = "Лукьянова";
        numberHouse = 10;

    }

    @Override
    public String toString() {
        return "House{" +
                "numberHouse='" + numberHouse + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", date='" + date + '\'' +
                ", architektName='" + architektName + '\'' +
                ", memorial=" + memorial +
                '}';
    }

    public House(){};
    public House(String name, String adress, String date, String architektName, Boolean memorial, int numberHouse) {
        super(name, adress, date, architektName, memorial);
        this.numberHouse = numberHouse;
    }

    public void disp(){
        System.out.println(super.name);
        System.out.println(super.adress);
        System.out.println(numberHouse);
    }

   int numberHouse;
    int countPeople = 320;
    String date = "20.05.1991";

    @Override
    public void dispCountPeople() {
        System.out.println("Количество жителей в доме:" + countPeople);
    }

    @Override
    public void dateDestroy() {
        System.out.println("Дата сноса: " + date);
    }
}
