import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        //findTrFactNum();
        //PrintSimpleNums();
        //Calc();
    }

    //1.Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void findTrFactNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое натуральное число");
        int n = sc.nextInt();
        int start = 1;
        int res1 = 0;
        int res2 = 1;
        while (start <= n) {
            res1 += start;
            res2 *= start;
            start++;
        }
        System.out.println("Треугольное число = " + res1);
        System.out.println("Факториал = " + res2);
    }

    //2.Вывести все простые числа от 1 до 1000
    public static void PrintSimpleNums() {
        int start = 2;
        int finish = 100;
        boolean flag = true;
        while (start<finish){
            for (int i = 2; i <= Math.sqrt(start)+1; i++) {
                if (start == 2) System.out.println(start);
                if (start%i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(start);
            flag = true;
            start++;
        }
    }

    public static void Calc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор может совершать операции только над двумя числами");
        System.out.println("Введите первое число");
        int fir = sc.nextInt(); //как обработать ошибку при вводе строки
        System.out.println("Введите второе число");
        int sec = sc.nextInt();
        System.out.println("Введите символ операции ('+' - сложение; '-' - вычитание; '*' - умножение; '/' - деление; ");
        String sign = sc.next();
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

        }
    }
