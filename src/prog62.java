import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
// уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class prog62 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Integer[] arr = new Integer[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(25);
        }
        System.out.println(Arrays.toString(arr));

        HashSet<Integer> set = new HashSet<>(List.of(arr));
        System.out.println(set);
        float result = (float)set.size() * 100 / arr.length;
        System.out.println(result);

    }
}
