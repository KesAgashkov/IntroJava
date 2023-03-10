package abstractTest;

public class Main {
    public static void main(String[] args) {
        Library lib1 =  new Library();
        System.out.println(lib1.toString());
        House h1 =  new House();
        h1.disp();
        lib1.CountPeoplePerDay();
        h1.dispCountPeople();
        h1.dateDestroy();
    }
}
