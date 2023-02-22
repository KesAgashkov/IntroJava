import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Hw4 {

    public static void main(String[] args) throws IOException {
        //Создали LinkedList и присвоили результат переменной. Вывели первичный лист.
        // Вывели изменённый лист.
//        LinkedList <Integer> test = getLinkedList(10);
//        System.out.println("Исходный список : " + test);

//      System.out.println(getReverseLinkedList(test));

//      System.out.println("Изменённый список: "+ enqueue(test,10));

//      System.out.println("Выделенный первый элемент списка: "+dequeue(test));
//      System.out.println("Изменённый список: "+test);

//      System.out.println("Выделенный первый элемент списка: "+first(test));
//      System.out.println("Список без изменений: "+test);

        Calc();

    }

    // Функция создания LinkedList с n-элементами отобранными случайным образом от 0 до 100
    public static LinkedList getLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            list.add(r.nextInt(100));
        }
        return list;
    }

//    1.Пусть дан LinkedList с несколькими элементами.
//    Реализуйте метод, который вернет “перевернутый” список.

    public static LinkedList getReverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> res = new LinkedList<>();
        int inter = 0;
        for (int i = list.size() - 1; i > -1; i--) {
            res.add(list.get(i));
        }
        return res;
    }

    //    2.Реализуйте очередь с помощью LinkedList со следующими методами:
//    enqueue() - помещает элемент в конец очереди, dequeue()
    public static LinkedList enqueue(LinkedList<Integer> list, int append){
        list.add(append);
        return list;
    }
//    dequeue() - возвращает первый элемент из очереди и удаляет его,
    public static Integer dequeue (LinkedList<Integer> list){
        int res = list.peekFirst();
        list.removeFirst();
        return res;
}
//    first() - возвращает первый элемент из очереди, не удаляя.

        public static Integer first (LinkedList<Integer> list) {
            int res = list.peekFirst();
            return res;
        }

//    3.В калькулятор добавьте возможность отменить последнюю операцию.
    public static void Calc() throws IOException {
        LinkedList<Integer> list = new LinkedList<>();
        int res = 0;
        String save = "";
        LinkedList<String> dataCalc = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger(Hw4.class.getName());
        FileHandler fHandler = new FileHandler("LogСalc.txt", true);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        log.addHandler(fHandler);
        System.out.println("Калькулятор может совершать операции только над двумя числами");
        int fir = 1;
        int sec = 1;
        String sign = " ";
        while(true) {
            System.out.println("Введите символ операции ('+' - сложение; '-' - вычитание;" +
                    " '*' - умножение; '/' - деление; 'z' - показать результат предыдущей операции;" +
                    "  'x' - выход из программы");
            try {
                sign = sc.next();
                log.info("Знак операции успешно обработан");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (sign.equals("x")){
                System.out.println("Выход из программы");
                System.exit(0);
            }else if (sign.equals("z")){
                System.out.println("Значение последней операции");
                System.out.println(dataCalc.peekLast());
                continue;
            }

            System.out.println("Введите первое число");
            try {
                fir = sc.nextInt();
                log.info("первое число успешно обработано");
            } catch (Exception e) {
                e.printStackTrace();
                log.log(Level.SEVERE, "ошибка ввода, попробуйте еще раз");
                Calc();
            }

            System.out.println("Введите второе число");
            try {
                sec = sc.nextInt();
                log.info("второе число успешно обработано");
            } catch (Exception e) {
                e.printStackTrace();
                log.log(Level.SEVERE, "ошибка ввода, попробуйте еще раз");
                Calc();
            }

            switch (sign) {
                case "+":
                    res = fir + sec;
                    save = fir + " + " + sec + " = " + res;
                    System.out.println(save);
                    log.info("Программа успешно отработала");
                    dataCalc.add(save);
                    break;
                case "-":
                    res = fir - sec;
                    save = fir + " - " + sec + " = " + res;
                    System.out.println(save);
                    log.info("Программа успешно отработала");
                    dataCalc.add(save);
                    break;
                case "*":
                    res = fir * sec;
                    save = fir + " * " + sec + " = " + res;
                    System.out.println(save);
                    log.info("Программа успешно отработала");
                    dataCalc.add(save);
                    break;
                case "/":
                    if (sec == 0) {
                        log.log(Level.SEVERE,"На ноль делить нельзя");
                        Calc();
                    } else {
                        res = fir / sec;
                        save = fir + " / " + sec + " = " + res;
                        System.out.println(save);
                        log.info("Программа успешно отработала");
                        dataCalc.add(save);
                    }
                    break;
                default:
                    log.log(Level.SEVERE,"Такой операции не найдено, попробуйте заново");
            }

        }

    }
}
