package abstractTest;

public abstract class Building {

    public Building(){};
    public Building(String name, String adress, String date, String architektName, Boolean memorial) {
        this.name = name;
        this.adress = adress;
        this.date = date;
        this.architektName = architektName;
        this.memorial = memorial;
    }

    String name;
    String adress;
    String date;
    String architektName;
    Boolean memorial;
    public abstract String toString();
}
