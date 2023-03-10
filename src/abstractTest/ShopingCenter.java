package abstractTest;

public class ShopingCenter extends Building{
    public ShopingCenter(String name, String adress, String date, String architektName, Boolean memorial, int countShop) {
        super(name, adress, date, architektName, memorial);
        this.countShop = countShop;
    }

    @Override
    public String toString() {
        return "ShopingCenter{" +
                "countShop=" + countShop +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", date='" + date + '\'' +
                ", architektName='" + architektName + '\'' +
                ", memorial=" + memorial +
                '}';
    }

    int countShop;



}
