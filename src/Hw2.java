import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Hw2 {
    public static void main(String[] args) {

//        Buble();
          Calc();

    }


//1. Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл
    public static void Buble() {
        int[] arr = new int[]{17, 24, 91, 96, 67, -27, 79, -71, -71, 58, 48, 88, 88, -16, -78, 96, -76, 56, 92, 1, 32, -17, 36, 88, -61, -97, -37,
                -84, 50, 47, 94, -6, 52, -76, 93, 14, -32, 98, -65, -16, -9, -68, -20, -40, -71, 93, -91, 44, 25, 79, 97, 0, -94, 7, -47, -96, -55, -58};
        int pod;
        int elts = arr.length;
        String add;
        Logger log = Logger.getLogger(Main.class.getName());
        for (int i = 0; i < elts; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    pod = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = pod;
                }


            }
            add = Arrays.toString(arr);
            try (FileWriter writer = new FileWriter("operationBubble.txt",true)) {
                    writer.write("Результат " + (i+1) + "-й итерации" + "\n" + add + "\n");
                    writer.flush();
                    writer.close();
                    log.info("прошла очередная итерация. Полет нормальный. Массивы пишутся в файл");
            } catch (IOException e) {
                    e.printStackTrace();
                    log.info("Ошибка записи файла");
            }
            }

            }






//2. К калькулятору из предыдущего дз добавить логирование.
public static void Calc() {
    Scanner sc = new Scanner(System.in);
    Logger log = Logger.getLogger(Main.class.getName());
    System.out.println("Калькулятор может совершать операции только над двумя числами");
    System.out.println("Введите первое число");
    int fir =1; int sec =1; String sign = " ";
    try{
        fir = sc.nextInt();
        log.info("первое число успешно обработано");
    }catch(InputMismatchException e){
        log.info("ошиюка ввода, попробуйте еще раз");
        Calc();
    }
    System.out.println("Введите второе число");
    try{
        sec = sc.nextInt();
        log.info("второе число успешно обработано");
    }catch(InputMismatchException e){
        log.info("ошибка ввода, попробуйте еще раз");
        Calc();
    }

    System.out.println("Введите символ операции ('+' - сложение; '-' - вычитание; '*' - умножение; '/' - деление; ");
    try{
        sign = sc.next();
        log.info("Знак операции успешно обработан");
    }catch(InputMismatchException e){
    }
    switch (sign){
        case ("+"):
            System.out.println(fir + " + " + sec + " = " + (fir+sec));
            break;
        case ("-"):
            System.out.println(fir + " - " + sec + " = " + (fir-sec));
            break;
        case ("*"):
            System.out.println(fir + " * " + sec + " = " + (fir*sec));
            break;
        case ("/"):
            if (sec == 0) {
                System.out.println("На ноль делить нельзя");
                Calc();
            }else System.out.println(fir + " / " + sec + " = " + (fir/sec));
            break;
        default:
            System.out.println("Такой операции не найдено, попробуйте заново");
            break;
    }
    log.info("Программа успешно отработала");

}
}


