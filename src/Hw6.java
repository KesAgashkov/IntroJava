import java.io.PrintStream;
import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//
//        2 - Объем ЖД
//
//        3 - Операционная система
//
//        4 - Цвет …
//
// Далее нужно запросить минимальные значения для указанных критериев -
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
// Сдайте задание до: 7 марта, 21:00 +04:00 UTC

public class Hw6 {
    public static void main(String[] args) {
        Notebooks nout1 = new Notebooks();
        nout1.serialNum = 10001;
        nout1.price = 10000;
        nout1.hardDiskType = "ssd";
        nout1.ramType = "DDR3";
        nout1.colour = "black";

        Notebooks nout2 = new Notebooks();
        nout2.serialNum = 10002;
        nout2.price = 9000;
        nout2.hardDiskType = "hdd";
        nout2.ramType = "DDR5";
        nout2.colour = "green";

        Notebooks nout3 = new Notebooks();
        nout3.serialNum = 10003;
        nout3.price = 20000;
        nout3.hardDiskType = "ssd";
        nout3.ramType = "DDR4";
        nout3.colour = "gold";

        Notebooks nout4 = new Notebooks();
        nout4.serialNum = 10004;
        nout4.price = 30000;
        nout4.hardDiskType = "ssd";
        nout4.ramType = "DDR5";
        nout4.colour = "yelow";

        Notebooks nout5 = new Notebooks();
        nout5.serialNum = 10005;
        nout5.price = 8000;
        nout5.hardDiskType = "hdd";
        nout5.ramType = "DDR2";
        nout5.colour = "silver";

        Notebooks nout6 = new Notebooks();
        nout6.serialNum = 10006;
        nout6.price = 12000;
        nout6.hardDiskType = "hdd";
        nout6.ramType = "DDR3";
        nout6.colour = "white";

        HashSet<Notebooks> nouts = new HashSet<>();

        nouts = new HashSet<Notebooks>(Arrays.asList(nout1, nout2, nout3, nout4, nout5, nout6));

        System.out.println(nouts);

        HashMap<Integer, String> nameSearch = new HashMap<>();
        nameSearch.put(1, "SerialNum int");
        nameSearch.put(2, "price int");
        nameSearch.put(3, "hardDiskType Str");
        nameSearch.put(4, "ramType Str");
        nameSearch.put(5, "colour Str");


//    }
//        public static ArrayList<String> improveSearch(HashMap criteria, HashSet nouts){
//            ArrayList<String> sear = new ArrayList<String>();
//            ArrayList<String> res = new ArrayList<String>();
//            String [] preArr = new String[5];
//            String strSear = "";
//            int i = 0;
//
//            Scanner sc = new Scanner(System.in);
//            for (int j = 1; j <= 5; j++) {
//                System.out.println(j + " " + criteria.get(j));
//            }
//            System.out.println("Введите по очереди все критерии через enter.\n" +
//                    "В случае если хотите пропустить критерий нажмите введите 0.\n" +
//                    "В главном блоке есть подсказка по типам вводимых данных");
//            for (int j = 1; j <= 5; j++) {
//                System.out.println(criteria.get(j) + " Введите значение: " );
//                if (j<5) strSear+=j+":" + (sc.next() + ",");
//                else strSear+=j+":" + (sc.next());
//            }
//            for (int j = 0; j < preArr.length; j++) {
//                preArr[j] = sear.get(j).split(":")[1];
//            }
//            sear.addAll(List.of(strSear.split(",")));
//            for (Notebooks item : nouts) { //почему так нельзя????
//                if (Integer.parseInt(preArr[1])!=0) {
//                    if ( item.serialNum == Integer.parseInt(preArr[0]) && item.price == Integer.parseInt(preArr[1]) &&
//                            item.hardDiskType.contains(preArr[2].toLowerCase()) &&
//                            item.ramType.contains(preArr[3].toLowerCase()) &&
//                            item.colour.contains(preArr[4].toLowerCase())) res.add(String.valueOf(item));
//                }
//
//            }
//            return res;
//            }


    }
}
