
public class Insect extends Animal{
    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    @Override
    public String toString() {
        return "Insect{" +
                "wingCount=" + wingCount +
                ", likeJesus=" + likeJesus +
                "} " + super.toString();
    }

    int wingCount;
    boolean likeJesus;
    {
        super.setName("Сверчок");
        super.setType("Насекомые");
        super.setFly(true);
    }
    public Insect() {
        super();
    }

    void ggggg (){
        System.out.println("Ggggg");
    }

    public void display(){
        System.out.println("I am a insect");
        super.display();
        System.out.println("Количество крыльев: " + getWingCount());
        System.out.println(isLikeJesus() ? "Умеет ходить по воде? : да" : "Умеет ходить по воде? : нет");
        System.out.println();

    }




}
