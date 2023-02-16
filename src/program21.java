/*Дано четное число N (>0) и символы c1 и c2. 
Написать метод, который вернет строку длины N, 
которая состоит из чередующихся символов c1 и c2, начиная с c1.*/
//import java.util.Scanner;

public class program21 {
    public static void main(String[] args) {
       /*System.out.print("Введите любое целое число : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();*/
        int num = 10;
        String str1 = "c1";
        String str2 = "c2";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num/2; i++) {
            sb.append(str1);
            sb.append(str2);
        }
        System.out.println(sb);
    }
    
}
