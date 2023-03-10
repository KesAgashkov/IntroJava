package abstractTest;

public class Library extends Building implements SocialHouse{
    @Override
    public String toString() {
        return "Library{" +
                "countBook=" + countBook +
                ", manager='" + manager + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", date='" + date + '\'' +
                ", architektName='" + architektName + '\'' +
                ", memorial=" + memorial +
                '}';
    }

    public Library(){};
    public Library(String name, String adress, String date, String architektName, Boolean memorial, int countBook, String manager) {
        super(name, adress, date, architektName, memorial);
        this.countBook = countBook;
        this.manager = manager;
    }

    int countBook;
    String manager;
    int countPeople = 1000;
    int expence = 10000;

    @Override
    public void CountPeoplePerDay() {
        System.out.println("Среднее количество посетителей в день: " + countPeople);
    }

    @Override
    public void expences() {
        System.out.println("Стоимость содержания библиотеки: " + expence);

    }
}
