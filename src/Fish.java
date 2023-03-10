public class Fish extends Animal{
    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    String squama;
    boolean upStreamSwim;

    {
        super.setName("Золотая рыбка");
        super.setType("Рыбки");
        super.setSwimm(true);
    }
    public Fish() {
        super();
    }

    void bul_bul(){
        System.out.println("Bul-bul");
    }

    public void display(){
        System.out.println("I am a fish");
        super.display();
        System.out.println("Чешуя: " + getSquama());
        System.out.println(isUpStreamSwim() ? "Умеет плыть против течения? : да" : "Умеет плыть против течения? : нет");
        System.out.println();

    }

    @Override
    public String toString(){
        return "I am Fish"+ "\n" + super.toString() + "\n" + "чешуя: " + getSquama() + "\n" +
                "Плывёт против течения? :" + isUpStreamSwim();
    }


}