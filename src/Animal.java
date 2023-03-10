import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Animal {
    public String type;
    public String name;
    public int age;
    public double weight;
    public boolean isSwim;
    public boolean isWalk;
    public boolean isFly;
    public static int count = 0;
    public final static String STRING_DESC = "Суперкласс для данного класса класс 'Animal'";

    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isSwim=" + isSwim +
                ", isWalk=" + isWalk +
                ", isFly=" + isFly +
                ", count" + count +
                '}';
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public boolean isSwimm() {
        return isSwim;
    }

    public void setSwimm(boolean swim) {
        isSwim = swim;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public Animal(){
        count++;
    };

    public Animal(String type, String name){
        this.type =  type;
        this.name =  name;
    }

    public Animal(String type, int age){
        this.name = "No name";
        this.type =  type;
        this.age =  age;

    }

    public Animal(String type, String name, int age, double weight, boolean isSwim, boolean isWalk, boolean isFly){
        this.type = type;
        this.name =  name;
        this.age =  age;
        this.weight =  weight;
        this.isSwim =  isSwim;
        this.isWalk = isWalk;
        this.isFly = isFly;
        count++;
    }


    public void display(){
        System.out.println("Тип: " + getType());
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Вес: "+ getAge());
        System.out.println(isSwim ? "Плавает? : да" : "Плавает? : нет");
        System.out.println(isWalk ? "Бегает? : да" : "Бегает? : нет");
        System.out.println(isFly ? "Летает? : да" : "Летает? : нет");
    }
    public final void rename (String improve){
        System.out.print("Заменили имя " + name + " на " );
        name = improve;
        System.out.println(name);

    }

    public void holiday (){weight += 0.1;}

    public void holiday (double m){weight += m;}

    public void holiday (double m, int n){weight += (m*n);}

    public static void countAnimals(){
        System.out.println("Количество зверей в зоопарке " + count);
    }


    public static void main(String[] args) {
        // First task

//        Animal tiger = new Animal();
//        tiger.type = "тигр";
//        tiger.name = "Артём";
//        tiger.age = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
//        tiger.display();
//        tiger.rename("Антон");
//        tiger.display();
//
//        Animal sparrow = new Animal();
//        sparrow.type = "воробей";
//        sparrow.name = "Капитан Джек";
//        sparrow.age = 3;
//        sparrow.weight = 2;
//        sparrow.isSwim = false;
//        sparrow.isWalk = true;
//        sparrow.isFly = true;
//        sparrow.display();
//        sparrow.holiday(2);
//        sparrow.display();

        // Second task

//        Animal tiger = new Animal("тигр", "Артём");
//        tiger.age = 15;
//        tiger.weight = 300.6;
//        tiger.isSwim = true;
//        tiger.isWalk = true;
//        tiger.isFly = false;
//        tiger.display();
//
//        Animal sparrow = new Animal("воробей", 5);
//        sparrow.weight = 2;
//        sparrow.isSwim = false;
//        sparrow.isWalk = true;
//        sparrow.isFly = true;
//        sparrow.display();
//
//        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//        duck.holiday(5);
//        duck.rename("Утя-Утя");
//        duck.display();

        // three task
//            Animal tiger = new Animal("тигр", "Артём");
//            tiger.setAge(15);
//            tiger.setWeight(300.6);
//            tiger.setSwimm(true);
//            tiger.setWalk(true);
//            tiger.setFly(false);
//            tiger.display();
//
//            Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//            duck.holiday(5);
//            duck.rename("Утя-Утя");
//            duck.display();
//            System.out.println(duck.getAge());
//            System.out.println(duck.getName());
//            System.out.println(duck.getWeight());
//            System.out.println(duck.getType());
//            System.out.println(duck.isSwimm());
//            System.out.println(duck.isWalk());
//            System.out.println(duck.isFly());
//        }
//        // four task
//        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//        duck.display();
//
//        duck.holiday();
//        duck.display();
//
//        duck.holiday(5);
//        duck.display();
//
//        duck.holiday(0.4);
//        duck.display();
//
//        duck.holiday(0.3, 2);
//        duck.display();
//        // five task
//            Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
//            duck.display();
//
//            Bird b = new Bird();
//            b.setName("Bob");
//            b.display();
//            b.setArea("На югах");
//            b.setWinterFly(false);
//            System.out.println(b.getArea());
//            System.out.println(b.isWinterFly());
//            b.chirick_chirick();
//
//            Fish f = new Fish();
//            f.setName("Сельд");
//            f.display();
//            f.setSquama("Крупная");
//            f.setUpStreamSwim(true);
//            System.out.println(f.getSquama());
//            System.out.println(f.isUpStreamSwim());
//            f.bul_bul();
//
//            Insect i = new Insect();
//            i.setName("Жук Жукыч");
//            i.display();
//            i.setWingCount(4);
//            i.setLikeJesus(true);
//            System.out.println(i.getWingCount());
//            System.out.println(i.isLikeJesus());
//            i.ggggg();

        // six task


//        Bird b = new Bird();
//        b.display();
//        b.setArea("На югах");
//        b.setWinterFly(true);
//        System.out.println(b.getArea());
//        System.out.println(b.isWinterFly());
//        b.chirick_chirick();
//        System.out.println(b.toString());
//
//        Fish f = new Fish();
//        f.display();
//        f.setSquama("Крупная");
//        f.setUpStreamSwim(true);
//        System.out.println(f.getSquama());
//        System.out.println(f.isUpStreamSwim());
//        f.bul_bul();
//        System.out.println(f.toString());
//
//        Insect i = new Insect();
//        i.setName("Жук Жукыч");
//        i.display();
//        i.setWingCount(4);
//        i.setLikeJesus(true);
//        System.out.println(i.getWingCount());
//        System.out.println(i.isLikeJesus());
//        i.ggggg();
//        i.display();
//        Animal.countAnimals();
//
//        System.out.println(i.toString());

        //seven task


        System.out.println(Animal.STRING_DESC);
        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.rename("Путя");
        duck.display();
    }

}



