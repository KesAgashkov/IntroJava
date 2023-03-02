import java.sql.SQLOutput;
import java.util.*;

public class Notebooks {
    Integer serialNum;
    Integer price;
    String hardDiskType;
    String ramType;
    String colour;
    public String toString() {
        return "Note{" +
                "serialNum=" + serialNum +
                ", price=" + price + '\'' +
                ", hardDiskType=" + hardDiskType + '\'' +
                ", ramType=" + ramType + '\'' +
                ", colour=" + colour
                +"}";
    }
    public static ArrayList searchNote(HashMap spis, HashSet goods) {
        ArrayList<String> output = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String res = "";
        int ser = 0;
        int pri = 0;
        String typeHdd = "";
        String typeRam = "";
        String col = "";
        for (int i = 1; i <= spis.size(); i++) {
            System.out.println(i + " " + spis.get(i));
        }
        int response = 1;
        System.out.println("Введите цифру соответствующую критерию поиска");
        try {
            response = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка. Введите цифру");
            System.exit(1);
        }
        switch (response) {
            case 1:
                System.out.println("Введите серию модели от 1 до " + goods.size());
                try {
                    ser = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Введен неверный параметр. Для дальнейшего поиска вызовите функцию еще раз");
                    System.exit(1);
                }
                for (Object item : goods) {
                    if (item.toString().contains(Integer.toString(ser))) {
                        res = item.toString();
                        output.add(res);
                    }
                }
                return output;
            case 2:
                System.out.println("Введите цену ноутбука от 0 до 100000");
                try {
                    pri = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Введен неверный параметр. Для дальнейшего поиска вызовите функцию еще раз");
                    System.exit(1);
                }
                for (Object item : goods) {
                    if (item.toString().contains(Integer.toString(pri))) {
                        res = item.toString();
                        output.add(res);
                    }
                }
                return output;
            case 3:
                System.out.println("Введите тип жесткого диска: 'ssd' или 'hdd'");
                try {
                    typeHdd = sc.next().toLowerCase();
                } catch (Exception e) {
                    System.out.println("Введен неверный параметр. Для дальнейшего поиска вызовите функцию еще раз");
                    System.exit(1);
                }
                for (Object item : goods) {
                    if (item.toString().contains(typeHdd)) {
                        res = item.toString();
                        output.add(res);
                    }
                }
                return output;
            case 4:
                System.out.println("Введите тип ОЗУ: DDR + цифра");
                try {
                    typeRam = sc.next().toLowerCase();
                } catch (Exception e) {
                    System.out.println("Введен неверный параметр. Для дальнейшего поиска вызовите функцию еще раз");
                    System.exit(1);
                }
                for (Object item : goods) {
                    if (item.toString().contains(typeRam)) {
                        res = item.toString();
                        output.add(res);
                    }
                }
                return output;
            case 5:
                System.out.println("Введите цвет ноутбука");
                try {
                    col = sc.next();
                } catch (Exception e) {
                    System.out.println("Введен неверный параметр. Для дальнейшего поиска вызовите функцию еще раз");
                    System.exit(1);
                }
                for (Object item : goods) {
                    if (item.toString().contains(typeRam)) {
                        res = item.toString();
                        output.add(res);
                    }
                }
                return output;
            default:
                System.out.println("Парaметр под данным номером отсутствует");
                System.exit(1);
                return output;
        }
    }
}


