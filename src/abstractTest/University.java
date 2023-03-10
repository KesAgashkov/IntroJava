package abstractTest;

public class University extends Building{
    int countStidents;

    @Override
    public String toString() {
        return "University{" +
                "countStidents=" + countStidents +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", date='" + date + '\'' +
                ", architektName='" + architektName + '\'' +
                ", memorial=" + memorial +
                '}';
    }

    public University(String name, String adress, String date, String architektName, Boolean memorial, int countStidents) {
        super(name, adress, date, architektName, memorial);
        this.countStidents = countStidents;
    }

}
