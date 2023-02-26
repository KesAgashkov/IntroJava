import java.util.*;

public class Hw5 {
    public static void main(String[] args) {
//        bookPhone();
//        findCountRepeatName();

        //Пирамидальная сортировка
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array :: ");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array :: ");
        int[] myArray = new int[size];
        for(int i=0; i<size; i++) {
            myArray[i] = scanner.nextInt();
        }
        heapSort(myArray, size);
    }

//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void bookPhone() {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов|432323|4323424|4323");
        db.put(321456, "Васильев|431242");
        db.put(234561, "Петрова|4343343|890204323");
        db.put(234432, "Иванов|4322343|434223");
        db.put(654321, "Петрова|324532");
        db.put(345678, "Иванов|43565243");

        for (var item : db.entrySet()){
                System.out.println(item.getKey() + " " + item.getValue());
            }

        }


//2. Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
    public static void findCountRepeatName() {
        Map<Integer, String> db = new HashMap<>();
        ArrayList <String> res = new ArrayList<>();
        ArrayList <String> finish = new ArrayList<>();
        int count = 0;
        db.put(001, "Иван Иванов");
        db.put(002, "Светлана Петрова");
        db.put(003, "Кристина Белова");
        db.put(004, "Анна Крутова");
        db.put(005, "Иван Юрин");
        db.put(006, "Петр Лыков");
        db.put(007, "Павел Чернов");
        db.put(020, "Петр Чернышов");
        db.put(021, "Мария Федорова");
        db.put(010, "Марина Светлова");
        db.put(011, "Мария Савина");
        db.put(012, "Мария Рыкова");
        db.put(013, "Марина Луговая");
        db.put(014, "Анна Владимирова");
        db.put(015, "Иван Мечников");
        db.put(016, "Петр Петин");
        db.put(017, "Иван Ежов");
        for (var item : db.entrySet()){
            res.add(item.getValue().split(" ")[0]);
        }
        Set <String> s = new HashSet<>(res);
        System.out.println(s);
        for (String p : s) {
            for (int j = 0; j < res.size(); j++) {
                if (p.equals(res.get(j)))
                    count++;
            }
            if (count>1) {
                finish.add(count + ": " + p);
                count = 0;
            }
        }
        String x = "";
        for (int i = 0; i < finish.size(); i++) {
            for (int j = 0; j < finish.size()-1; j++) {
                Character.getNumericValue(finish.get(i).charAt(0));
                if (Character.getNumericValue(finish.get(j).charAt(0))>Character.getNumericValue(finish.get(j+1).charAt(0))){
                    x = finish.get(j);
                    finish.set(j, finish.get(j+1));
                    finish.set(j+1,x);
                }
            }
            }
        System.out.println(finish);
        }



//3. Реализовать алгоритм пирамидальной сортировки (HeapSort).
    public static void heapSort(int[] myArray, int length) {
        int temp;
        int size = length-1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(myArray, i, size);
        };
        for(int i= size; i>=0; i--) {
            temp = myArray[0];
            myArray[0] = myArray[size];
            myArray[size] = temp;
            size--;
            heapify(myArray, 0, size);
        }
        System.out.println(Arrays.toString(myArray));
    }
    public static void heapify (int [] myArray, int i, int heapSize) {
        int a = 2 * i;
        int b = 2 * i + 1;
        int largestElement;
        if (a <= heapSize && myArray[a] > myArray[i]){
            largestElement = a;
        } else{
            largestElement = i;
        }
        if (b <= heapSize && myArray[b] > myArray[largestElement]){
            largestElement = b;
        }
        if (largestElement != i) {
            int temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            heapify(myArray, largestElement, heapSize);
        }

    }
}
